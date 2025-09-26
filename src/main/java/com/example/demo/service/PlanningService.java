package com.example.demo.service;

import com.example.demo.entity.Planning;
import com.example.demo.repository.PlanningRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlanningService {
    private final PlanningRepository repository;

    public PlanningService(PlanningRepository repository) {
        this.repository = repository;
    }

    public List<Planning> findAll() { return repository.findAll(); }
    public Optional<Planning> findById(Long id) { return repository.findById(id); }
    public Planning save(Planning planning) { return repository.save(planning); }
    public void delete(Long id) { repository.deleteById(id); }
}
