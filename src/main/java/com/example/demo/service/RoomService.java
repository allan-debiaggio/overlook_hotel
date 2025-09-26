package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Room;
import com.example.demo.repository.RoomRepository;

@Service
public class RoomService {
    private final RoomRepository repository;

    public RoomService(RoomRepository repository) {
        this.repository = repository;
    }

    public List<Room> findAll() { return repository.findAll(); }
    public Optional<Room> findById(Long id) { return repository.findById(id); }
    public Room save(Room room) { return repository.save(room); }
    public void delete(Long id) { repository.deleteById(id); }
}
