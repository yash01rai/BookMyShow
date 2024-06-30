package org.lld.bookmyshow24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@Entity // helps in table creation
public class Booking extends BaseModal {

    // providing cardinality for hibernate
    // 1 : 1
    // M : 1
    @ManyToOne
    private User user;
    private BookingStatus bookingStatus;
    private Date bookedAt;

    // 1 : M
    // M : 1
    @ManyToMany // cancelled show and new booking counts
    private List<ShowSeat> showSeats;

    // 1 : 1
    // M : 1
    @ManyToOne
    private Show show;
    private int amount;

    // 1 : M , booking has many payments
    // 1 : 1
    @OneToMany
    private List<Payment> payments;

}
