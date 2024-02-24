package com.indianparadises.destinationsservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class ShoppingSpot {

    public ShoppingSpot(String shoppingSpotName, String description, String header1, String body1, String header2, String body2) {
        this.shoppingSpotName = shoppingSpotName;
        this.description = description;
        this.header1 = header1;
        this.body1 = body1;
        this.header2 = header2;
        this.body2 = body2;
    }

    @Id
    @GeneratedValue
    private Long shoppingSpotId;

    private String shoppingSpotName;

    private String description;

    private String header1;

    @Lob
    private String body1;

    private String header2;

    @Lob
    private String body2;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}
