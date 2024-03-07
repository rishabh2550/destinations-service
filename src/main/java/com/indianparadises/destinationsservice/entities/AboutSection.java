package com.indianparadises.destinationsservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class AboutSection {

    @Id
    @GeneratedValue
    private Long id;

    private String header;

    @Lob
    private String description;

    private Long aboutSectionImageId;

}
