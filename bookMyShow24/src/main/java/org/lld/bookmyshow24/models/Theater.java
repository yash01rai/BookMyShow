package org.lld.bookmyshow24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theater extends BaseModal {
    private String name;

    // 1 : 1
    // M : 1
    @ManyToOne
    private Region region;

    // 1 : M
    // 1 : 1
    @OneToMany
    private List<Show> shows;
//    private List<Screen> screens;


}
