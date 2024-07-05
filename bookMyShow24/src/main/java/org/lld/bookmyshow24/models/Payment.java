package org.lld.bookmyshow24.models;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModal {

    private int amount;
    private int ref_number;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;

    @Enumerated(EnumType.ORDINAL)
    private PaymentProvider paymentProvider;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

}


