package org.lld.bookmyshow24.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModal {

    // 1 : 1
    // M : 1
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;


}
