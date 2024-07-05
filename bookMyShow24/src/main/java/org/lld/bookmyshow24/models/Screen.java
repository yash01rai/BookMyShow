package org.lld.bookmyshow24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModal {

    private String name;

    // 1 : M
    // 1 : 1
    @OneToMany
    private List<Seat> seats;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection // creates mapping table for enums screen_id : feature_id
    private List<Features> features;

    @ManyToOne
    private Theater theater; // if you require then only add the attribute
}
