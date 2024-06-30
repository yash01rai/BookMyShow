package org.lld.bookmyshow24.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType extends BaseModal {

    private Show show;
    private SeatType seatType;
    private int price;

}
