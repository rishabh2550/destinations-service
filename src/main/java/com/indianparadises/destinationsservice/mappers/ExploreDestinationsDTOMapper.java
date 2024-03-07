package com.indianparadises.destinationsservice.mappers;

import com.indianparadises.destinationsservice.dtos.ExploreDestinatiosDTO;
import com.indianparadises.destinationsservice.dtos.ImageDTO;
import com.indianparadises.destinationsservice.entities.City;

public class ExploreDestinationsDTOMapper {

    public static ExploreDestinatiosDTO mapCityAndImageDTOToExploreDestinationsDTO(City city, ImageDTO imageDTO) {
        return new ExploreDestinatiosDTO(city.getCityId(), city.getCityName(), city.getDescription(), imageDTO.getImageId(), imageDTO.getImageName(), imageDTO.getImage());
    }

}
