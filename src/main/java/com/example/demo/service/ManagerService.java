package com.example.demo.service;

import com.example.demo.entity.Manager;
import com.example.demo.repository.ManagerRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ManagerService {
    private final ManagerRepository repository;

    public ManagerService(ManagerRepository repository) {
        this.repository = repository;
    }

    public List<Manager> findAll() { return repository.findAll(); }
    public Optional<Manager> findById(Long id) { return repository.findById(id); }
    public Manager save(Manager manager) { return repository.save(manager); }
    public void delete(Long id) { repository.deleteById(id); }
}
