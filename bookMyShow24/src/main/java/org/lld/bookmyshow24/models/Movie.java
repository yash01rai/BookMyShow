package org.lld.bookmyshow24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModal {

    private String name;
    private List<String> actors;

}
