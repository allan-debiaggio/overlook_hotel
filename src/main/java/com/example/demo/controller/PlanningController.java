package com.example.demo.controller;

import com.example.demo.model.Planning;
import com.example.demo.service.PlanningService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plannings")
public class PlanningController {

    private final PlanningService service;

    public PlanningController(PlanningService service) {
        this.service = service;
    }

    // GET /api/plannings
    @GetMapping
    public List<Planning> getAllPlannings() {
        return service.findAll();
    }

    // GET /api/plannings/{id}
    @GetMapping("/{id}")
    public Planning getPlanning(@PathVariable Long id) {
        return service.findById(id);
    }

    // POST /api/plannings
    @PostMapping
    public Planning createPlanning(@RequestBody Planning planning) {
        return service.save(planning);
    }

    // PUT /api/plannings/{id}
    @PutMapping("/{id}")
    public Planning updatePlanning(@PathVariable Long id, @RequestBody Planning planning) {
        return service.update(id, planning);
    }

    // DELETE /api/plannings/{id}
    @DeleteMapping("/{id}")
    public void deletePlanning(@PathVariable Long id) {
        service.delete(id);
    }
}
