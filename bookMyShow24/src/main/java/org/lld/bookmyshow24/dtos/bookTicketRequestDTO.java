package org.lld.bookmyshow24.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class bookTicketRequestDTO {

    private List<Integer> showSeatIds;
    private int showId;
    private int userId;

}
