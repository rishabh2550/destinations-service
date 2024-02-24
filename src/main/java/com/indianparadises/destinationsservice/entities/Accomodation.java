package com.indianparadises.destinationsservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Accomodation {

    public Accomodation(String accomodationName, String accomodationType, Address address, Contact contact) {
        this.accomodationName = accomodationName;
        this.accomodationType = accomodationType;
        this.address = address;
        this.contact = contact;
    }

    @Id
    @GeneratedValue
    private Long accomodationId;

    private String accomodationName;

    private String accomodationType;

    @ManyToOne
    @JoinColumn(name = "cityId")
    private City city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId", referencedColumnName = "addressId")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactId", referencedColumnName = "contactId")
    private Contact contact;

}
