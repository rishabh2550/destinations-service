package com.indianparadises.destinationsservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExploreDestinatiosDTO {

    private Long cityId;
    private String cityName;
    private String description;
    private Long imageId;
    private String imageName;
    private byte[] image;

}
