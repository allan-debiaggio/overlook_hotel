package com.example.demo.controller;

import com.example.demo.model.Installation;
import com.example.demo.service.InstallationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/installations")
public class InstallationController {

    private final InstallationService service;

    public InstallationController(InstallationService service) {
        this.service = service;
    }

    // GET /api/installations
    @GetMapping
    public List<Installation> getAllInstallations() {
        return service.findAll();
    }

    // GET /api/installations/{id}
    @GetMapping("/{id}")
    public Installation getInstallation(@PathVariable Long id) {
        return service.findById(id);
    }

    // POST /api/installations
    @PostMapping
    public Installation createInstallation(@RequestBody Installation installation) {
        return service.save(installation);
    }

    // DELETE /api/installations/{id}
    @DeleteMapping("/{id}")
    public void deleteInstallation(@PathVariable Long id) {
        service.delete(id);
    }
}
