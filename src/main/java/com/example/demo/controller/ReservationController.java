package com.example.demo.controller;

import com.example.demo.model.Reservation;
import com.example.demo.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    // GET /api/reservations
    @GetMapping
    public List<Reservation> getAllReservations() {
        return service.findAll();
    }

    // GET /api/reservations/{id}
    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable Long id) {
        return service.findById(id);
    }

    // GET /api/reservations/user/{userId}
    @GetMapping("/user/{userId}")
    public List<Reservation> getReservationsByUser(@PathVariable Long userId) {
        return service.findByUser(userId);
    }

    // GET /api/reservations/installation/{installationId}
    @GetMapping("/installation/{installationId}")
    public List<Reservation> getReservationsByInstallation(@PathVariable Long installationId) {
        return service.findByInstallation(installationId);
    }

    // POST /api/reservations
    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return service.save(reservation);
    }

    // PUT /api/reservations/{id}
    @PutMapping("/{id}")
    public Reservation updateReservation(@PathVariable Long id, @RequestBody Reservation reservation) {
        return service.update(id, reservation);
    }

    // DELETE /api/reservations/{id}
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        service.delete(id);
    }
}
