package com.distanceCites.citiesapi.states.repositories;

import com.distanceCites.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
