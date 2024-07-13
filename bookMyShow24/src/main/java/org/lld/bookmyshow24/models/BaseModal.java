package org.lld.bookmyshow24.models;


import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass // annotation tells that it'll be going to each and every table model
@EntityListeners(AuditingEntityListener.class)
public class BaseModal {

    @Id // make it the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private int id;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date modifiedAt;

}
