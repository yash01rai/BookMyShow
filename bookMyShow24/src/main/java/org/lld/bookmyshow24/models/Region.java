package org.lld.bookmyshow24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Region extends BaseModal {

    private String name;

    // 1 : M
    // 1 : 1
    @OneToMany
    private List<Theater> theaters;

    // private List<Movie> movies;

}
