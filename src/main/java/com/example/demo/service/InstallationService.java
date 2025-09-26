package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Installation;
import com.example.demo.repository.InstallationRepository;

@Service
public class InstallationService {
    private final InstallationRepository repository;

    public InstallationService(InstallationRepository repository) {
        this.repository = repository;
    }

    public List<Installation> findAll() { return repository.findAll(); }
    public Optional<Installation> findById(Long id) { return repository.findById(id); }
    public Installation save(Installation installation) { return repository.save(installation); }
    public void delete(Long id) { repository.deleteById(id); }
}
