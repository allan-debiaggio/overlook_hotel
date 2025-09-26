package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Loyalty;
import com.example.demo.repository.LoyaltyRepository;

@Service
public class LoyaltyService {
    private final LoyaltyRepository repository;

    public LoyaltyService(LoyaltyRepository repository) {
        this.repository = repository;
    }

    public List<Loyalty> findAll() { return repository.findAll(); }
    public Optional<Loyalty> findById(Long id) { return repository.findById(id); }
    public Loyalty save(Loyalty loyalty) { return repository.save(loyalty); }
    public void delete(Long id) { repository.deleteById(id); }
}
