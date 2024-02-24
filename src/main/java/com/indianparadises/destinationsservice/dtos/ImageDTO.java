package com.indianparadises.destinationsservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageDTO {

    private Long imageId;
    private Long cityId;
    private String imageName;
    private byte[] image;
    private boolean primaryImage;

}
