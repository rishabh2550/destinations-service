package com.indianparadises.destinationsservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class About {

    public About(String attribute1, String attribute2, String attribute3, String header1, String body1) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.header1 = header1;
        this.body1 = body1;
    }

    @Id
    @GeneratedValue
    private Long aboutId;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String header1;

    @Lob
    private String body1;

}
