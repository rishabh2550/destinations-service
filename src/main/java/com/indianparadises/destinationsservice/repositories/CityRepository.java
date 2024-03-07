package com.indianparadises.destinationsservice.repositories;

import com.indianparadises.destinationsservice.dtos.ExploreDestinatiosDTO;
import com.indianparadises.destinationsservice.entities.AboutSection;
import com.indianparadises.destinationsservice.entities.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.hibernate.TransientPropertyValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CityRepository {

    @Autowired
    private EntityManager em;

    public City insertANewCity(City city) {
        em.persist(city);
        return city;
    }

    public void insertAboutSection(AboutSection aboutSection) {
        em.persist(aboutSection);
    }

    public List<City> exploreDestinations() {
        String jpql = "select c from City c";
        TypedQuery<City> query = em.createQuery(jpql, City.class);
        return query.getResultList();
    }

}
