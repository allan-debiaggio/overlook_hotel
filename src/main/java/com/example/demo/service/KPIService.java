package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.KPI;
import com.example.demo.repository.KPIRepository;

@Service
public class KPIService {
    private final KPIRepository repository;

    public KPIService(KPIRepository repository) {
        this.repository = repository;
    }

    public List<KPI> findAll() { return repository.findAll(); }
    public Optional<KPI> findById(Long id) { return repository.findById(id); }
    public KPI save(KPI kpi) { return repository.save(kpi); }
    public void delete(Long id) { repository.deleteById(id); }
}
