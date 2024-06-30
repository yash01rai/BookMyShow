package org.lld.bookmyshow24.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Movie extends BaseModal {
    private String name;
    private List<String> actors;
//    private List<Language> languages;
//    private double duration;
}
