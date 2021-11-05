package com.distanceCitesApi.states.repositories;

import com.distanceCitesApi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
