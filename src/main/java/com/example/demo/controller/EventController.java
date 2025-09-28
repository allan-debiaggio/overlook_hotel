package com.example.demo.controller;

import com.example.demo.model.Event;
import com.example.demo.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    // GET /api/events
    @GetMapping
    public List<Event> getAllEvents() {
        return service.findAll();
    }

    // GET /api/events/{id}
    @GetMapping("/{id}")
    public Event getEvent(@PathVariable Long id) {
        return service.findById(id);
    }

    // POST /api/events
    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return service.save(event);
    }

    // DELETE /api/events/{id}
    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        service.delete(id);
    }
}
