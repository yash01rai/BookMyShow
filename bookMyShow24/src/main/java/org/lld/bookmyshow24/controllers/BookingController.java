package org.lld.bookmyshow24.controllers;

import org.lld.bookmyshow24.dtos.ResponseStatus;
import org.lld.bookmyshow24.dtos.bookTicketRequestDTO;
import org.lld.bookmyshow24.dtos.bookTicketResponseDTO;
import org.lld.bookmyshow24.models.Booking;
import org.lld.bookmyshow24.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component // parent annotation, automatically available

// controllers handling request/response
@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired // automatically inject incase of special class
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public bookTicketResponseDTO bookTicket(bookTicketRequestDTO request) {
        bookTicketResponseDTO response = new bookTicketResponseDTO();

        try {
            Booking booking = bookingService.bookTicket(
                    request.getShowSeatIds(),
                    request.getShowId(),
                    request.getUserId()
            );

            response.setBookingId(booking.getId());
            response.setAmount(booking.getAmount());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception exception) {
           response.setResponseStatus(ResponseStatus.FAILURE);
        }

        return response;
    }
}
