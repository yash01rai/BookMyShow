package org.lld.bookmyshow24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModal {

    private String number;

    // row and col are two reserve words in MySQL
    private int rowVal;
    private int colVal;

    @ManyToOne
    private SeatType seatType;

}
