package com.example.demo.controller;

import com.example.demo.model.Reward;
import com.example.demo.service.RewardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rewards")
public class RewardController {

    private final RewardService service;

    public RewardController(RewardService service) {
        this.service = service;
    }

    // GET /api/rewards
    @GetMapping
    public List<Reward> getAllRewards() {
        return service.findAll();
    }

    // GET /api/rewards/{id}
    @GetMapping("/{id}")
    public Reward getReward(@PathVariable Long id) {
        return service.findById(id);
    }

    // POST /api/rewards
    @PostMapping
    public Reward createReward(@RequestBody Reward reward) {
        return service.save(reward);
    }

    // PUT /api/rewards/{id}
    @PutMapping("/{id}")
    public Reward updateReward(@PathVariable Long id, @RequestBody Reward reward) {
        return service.update(id, reward);
    }

    // DELETE /api/rewards/{id}
    @DeleteMapping("/{id}")
    public void deleteReward(@PathVariable Long id) {
        service.delete(id);
    }
}
