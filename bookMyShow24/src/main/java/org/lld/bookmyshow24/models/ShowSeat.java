package org.lld.bookmyshow24.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModal {

    private Show show;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
    private Booking booking;

}
