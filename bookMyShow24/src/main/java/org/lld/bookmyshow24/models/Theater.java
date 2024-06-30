package org.lld.bookmyshow24.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Theater extends BaseModal {
    private String name;
    private Region region;
    private List<Show> shows;
//    private List<Screen> screens;
//    private List<Movie> movies;


}
