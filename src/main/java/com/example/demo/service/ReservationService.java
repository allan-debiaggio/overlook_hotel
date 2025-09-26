package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Reservation;
import com.example.demo.repository.ReservationRepository;

@Service
public class ReservationService {
    private final ReservationRepository repository;

    public ReservationService(ReservationRepository repository) {
        this.repository = repository;
    }

    public List<Reservation> findAll() { return repository.findAll(); }
    public Optional<Reservation> findById(Long id) { return repository.findById(id); }
    public Reservation save(Reservation reservation) { return repository.save(reservation); }
    public void delete(Long id) { repository.deleteById(id); }
}
