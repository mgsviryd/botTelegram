package com.sviryd.mikhail.service.dao;

import com.sviryd.mikhail.dao.entity.City;

import java.util.Optional;

public interface CityService {
    City save(City city);

    Iterable<City> saveAll(Iterable<City> cities);

    Optional<City> findById(Long id);

    boolean existsById(Long id);

    Iterable<City> findAll();

    Iterable<City> findAllById(Iterable<Long> ids);

    long count();

    void deleteById(Long id);

    void delete(City city);

    void deleteAll(Iterable<City> cities);

    void deleteAll();

    City findByName(String name);
}
