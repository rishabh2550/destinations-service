package com.indianparadises.destinationsservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class City {

    public City(String cityName, String description, About about, List<Accomodation> accomodations,
                List<Attraction> attractions, List<Restaurant> restaurants, List<ShoppingSpot> shoppingSpots) {
        this.cityName = cityName;
        this.description = description;
        this.about = about;
        this.accomodations = accomodations;
        this.attractions = attractions;
        this.restaurants = restaurants;
        this.shoppingSpots = shoppingSpots;
    }

    @Id
    @GeneratedValue
    private Long cityId;

    @Column(nullable = false)
    private String cityName;

    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aboutId", referencedColumnName = "aboutId")
    private About about;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Accomodation> accomodations;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Attraction> attractions;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Restaurant> restaurants;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<ShoppingSpot> shoppingSpots;

}
