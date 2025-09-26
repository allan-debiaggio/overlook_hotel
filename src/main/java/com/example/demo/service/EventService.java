package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Event;
import com.example.demo.repository.EventRepository;

@Service
public class EventService {
    private final EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> findAll() { return repository.findAll(); }
    public Optional<Event> findById(Long id) { return repository.findById(id); }
    public Event save(Event event) { return repository.save(event); }
    public void delete(Long id) { repository.deleteById(id); }
}
