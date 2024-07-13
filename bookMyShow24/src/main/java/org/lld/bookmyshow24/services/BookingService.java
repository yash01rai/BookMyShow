package org.lld.bookmyshow24.services;

import org.lld.bookmyshow24.models.*;
import org.lld.bookmyshow24.repositories.BookingRepository;
import org.lld.bookmyshow24.repositories.ShowRepository;
import org.lld.bookmyshow24.repositories.ShowSeatRepository;
import org.lld.bookmyshow24.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private BookingRepository bookingRepository;

    @Autowired
    public BookingService(
            UserRepository userRepository,
            ShowRepository showRepository,
            ShowSeatRepository showSeatRepository,
            BookingRepository bookingRepository
    ) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.bookingRepository = bookingRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(
            List<Integer> showSeatIds,
            int showId,
            int userId
    ) {

        // 1. Get the User from UserId
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()) {
            throw new RuntimeException("user not found");
        }

        User user = userOptional.get();

        // 2. Get the Show from ShowId
        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isEmpty()) {
            throw new RuntimeException("show not found");
        }

        Show show = showOptional.get();

        // --------- Transaction start ----------- for high consistency
        // 3. Get the ShowSeat from Ids
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);

        // 4. Check if all the seats are available
        for(ShowSeat showSeat : showSeats){
            // 5. If No, throw error return response
            if(!showSeat.getShowSeatStatus().equals(ShowSeatStatus.EMPTY)){
                throw new RuntimeException("show seat not empty");
            }
        }

        // 6. If Yes, make seats as blocked
        List<ShowSeat> showSeatList = new ArrayList<>();
        for(ShowSeat showSeat : showSeats){
            showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKED);
            showSeat.setBlockedAt(new Date());
            // 7. Save the updates data of showSeats in the db
            showSeatList.add(showSeatRepository.save(showSeat));
        }

        // ---------- Transaction stops ----------
        // 8. Create a corresponding booking object
        Booking booking = new Booking();
        booking.setUser(user);
        booking.setShow(show);
        booking.setShowSeats(showSeatList);
        booking.setBookingStatus(BookingStatus.PENDING);
        booking.setBookedAt(new Date());
        booking.setAmount(100);
        booking.setPayments(new ArrayList<>());

        // save the booking in DB
        bookingRepository.save(booking);

        // 9. return the booking object
        return booking;
    }
}

// Price Calculator Service
//    calculatePrice

    // ShowSeats
    // for all the show seats
        // 1. find showSeatType using show
        // 2. for all showSeat you will check the type and price