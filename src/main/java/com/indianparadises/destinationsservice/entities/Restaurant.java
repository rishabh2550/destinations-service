package com.indianparadises.destinationsservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {

    public Restaurant(String restaurantName, String header1, String body1, Address address, Contact contact) {
        this.restaurantName = restaurantName;
        this.header1 = header1;
        this.body1 = body1;
        this.address = address;
        this.contact = contact;
    }

    @Id
    @GeneratedValue
    private Long restaurantId;

    private String restaurantName;

    private String header1;

    @Lob
    private String body1;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId", referencedColumnName = "addressId")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactId", referencedColumnName = "contactId")
    private Contact contact;

}
