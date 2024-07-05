package org.lld.bookmyshow24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "shows") // show is a reserve key word
public class Show extends BaseModal {

    // 1 : 1
    // M : 1
    @ManyToOne
    private Movie movie;
    private Date startTime;

    // 1 : 1
    // M : 1
    @ManyToOne
    private Screen screen;
    private int durations;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Features> features;

}
