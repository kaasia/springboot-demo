package com.kfly.service;

import com.kfly.domain.City;
import org.springframework.data.repository.Repository;

/**
 * Created by Kfly on 2016/4/19.
 */
interface CityRepository extends Repository<City,Long> {
//    Page<City> findAll(Pageable pageable);
//    Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(String name,String country, Pageable pageable);
    City findByNameAndCountryAllIgnoringCase(String name, String country);

}
