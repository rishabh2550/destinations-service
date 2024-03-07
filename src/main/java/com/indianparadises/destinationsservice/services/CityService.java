package com.indianparadises.destinationsservice.services;

import com.indianparadises.destinationsservice.entities.*;
import com.indianparadises.destinationsservice.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City insertANewCity(City city) {
        cityRepository.insertANewCity(city);
        return city;
    }

    public void insertAboutSection(AboutSection aboutSection) {
        cityRepository.insertAboutSection(aboutSection);
    }

    public List<City> exploreDestinations() {
        return cityRepository.exploreDestinations();
    }

}
