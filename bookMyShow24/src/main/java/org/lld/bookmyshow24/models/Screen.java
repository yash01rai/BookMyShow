package org.lld.bookmyshow24.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModal {

    private String name;
//    private Theater theater; if you require then only add the attribute
    private List<Seat> seats;
    private List<Features> features;


}
