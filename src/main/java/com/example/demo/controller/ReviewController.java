package com.example.demo.controller;

import com.example.demo.model.Review;
import com.example.demo.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService service;

    public ReviewController(ReviewService service) {
        this.service = service;
    }

    // GET /api/reviews
    @GetMapping
    public List<Review> getAllReviews() {
        return service.findAll();
    }

    // GET /api/reviews/{id}
    @GetMapping("/{id}")
    public Review getReview(@PathVariable Long id) {
        return service.findById(id);
    }

    // GET /api/reviews/user/{userId}
    @GetMapping("/user/{userId}")
    public List<Review> getReviewsByUser(@PathVariable Long userId) {
        return service.findByUser(userId);
    }

    // GET /api/reviews/installation/{installationId}
    @GetMapping("/installation/{installationId}")
    public List<Review> getReviewsByInstallation(@PathVariable Long installationId) {
        return service.findByInstallation(installationId);
    }

    // POST /api/reviews
    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return service.save(review);
    }

    // PUT /api/reviews/{id}
    @PutMapping("/{id}")
    public Review updateReview(@PathVariable Long id, @RequestBody Review review) {
        return service.update(id, review);
    }

    // DELETE /api/reviews/{id}
    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        service.delete(id);
    }
}
