package org.lld.bookmyshow24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class bookTicketResponseDTO {

    private ResponseStatus responseStatus;
    private int bookingId;
    private int amount;

}
