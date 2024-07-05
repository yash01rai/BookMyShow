package org.lld.bookmyshow24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatType extends BaseModal{

    private String value;

}
