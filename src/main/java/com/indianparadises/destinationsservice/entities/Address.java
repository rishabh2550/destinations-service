package com.indianparadises.destinationsservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Address {

    public Address(String address) {
        this.address = address;
    }

    @Id
    @GeneratedValue
    private Long addressId;

    private String address;

}
