package com.distanceCites.citiesapi.countries.repositories;

import com.distanceCites.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
