package org.lld.bookmyshow24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users") // user is reserved word, so store table name as users
public class User extends BaseModal {
    private String name;
    private String email;
    private String password;

    // 1 : M
    // 1 : 1
    @OneToMany
    private List<Booking> bookings;
}
