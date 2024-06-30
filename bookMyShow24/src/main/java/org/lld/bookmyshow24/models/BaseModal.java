package org.lld.bookmyshow24.models;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass // annotation tells that it'll be going to each and every table model
public class BaseModal {

    @Id // make it the primary key
    private int id;

    private Date createdAt;
    private Date modifiedAt;

}
