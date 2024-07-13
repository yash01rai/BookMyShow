package org.lld.bookmyshow24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDTO {

    private ResponseStatus responseStatus;
    private String message;
    private int userId;

}
