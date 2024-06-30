package org.lld.bookmyshow24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModal {
    private String name;
    private String email;
    private List<Booking> bookings;
}
