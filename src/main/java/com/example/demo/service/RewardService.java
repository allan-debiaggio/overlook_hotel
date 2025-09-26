package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Reward;
import com.example.demo.repository.RewardRepository;

@Service
public class RewardService {
    private final RewardRepository repository;

    public RewardService(RewardRepository repository) {
        this.repository = repository;
    }

    public List<Reward> findAll() { return repository.findAll(); }
    public Optional<Reward> findById(Long id) { return repository.findById(id); }
    public Reward save(Reward reward) { return repository.save(reward); }
    public void delete(Long id) { repository.deleteById(id); }
}
