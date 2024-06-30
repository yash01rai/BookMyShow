package org.lld.bookmyshow24.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModal {

    private String number;
    private int row;
    private int col;
    private SeatType seatType;

}
