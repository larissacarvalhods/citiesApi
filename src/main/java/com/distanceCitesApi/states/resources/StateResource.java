package com.distanceCitesApi.states.resources;

import com.distanceCitesApi.states.entities.State;
import com.distanceCitesApi.states.repositories.StateRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<State> states(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        Optional<State> optional = repository.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
