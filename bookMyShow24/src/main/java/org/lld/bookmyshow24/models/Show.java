package org.lld.bookmyshow24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModal {

    private Movie movie;
    private Date startTime;
    private Screen screen;
    private int durations;
    private List<Features> features;

}
