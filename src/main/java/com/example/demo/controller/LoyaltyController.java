package com.example.demo.controller;

import com.example.demo.model.Loyalty;
import com.example.demo.service.LoyaltyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loyalty")
public class LoyaltyController {

    private final LoyaltyService service;

    public LoyaltyController(LoyaltyService service) {
        this.service = service;
    }

    // GET /api/loyalty
    @GetMapping
    public List<Loyalty> getAll() {
        return service.findAll();
    }

    // GET /api/loyalty/{id}
    @GetMapping("/{id}")
    public Loyalty getById(@PathVariable Long id) {
        return service.findById(id);
    }

    // GET /api/loyalty/user/{userId}
    @GetMapping("/user/{userId}")
    public Loyalty getByUserId(@PathVariable Long userId) {
        return service.findByUserId(userId);
    }

    // POST /api/loyalty
    @PostMapping
    public Loyalty create(@RequestBody Loyalty loyalty) {
        return service.save(loyalty);
    }

    // POST /api/loyalty/{userId}/add/{points}
    @PostMapping("/{userId}/add/{points}")
    public Loyalty addPoints(@PathVariable Long userId, @PathVariable int points) {
        return service.addPoints(userId, points);
    }

    // DELETE /api/loyalty/{id}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
