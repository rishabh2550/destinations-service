package com.indianparadises.destinationsservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Contact {

    public Contact(String contact1, String contact2) {
        this.contact1 = contact1;
        this.contact2 = contact2;
    }

    @Id
    @GeneratedValue
    private Long contactId;

    private String contact1;

    private String contact2;

}
