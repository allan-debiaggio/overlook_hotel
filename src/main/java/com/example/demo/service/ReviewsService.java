package com.example.demo.service;

import com.example.demo.entity.Reviews;
import com.example.demo.repository.ReviewsRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewsService {
    private final ReviewsRepository repository;

    public ReviewsService(ReviewsRepository repository) {
        this.repository = repository;
    }

    public List<Reviews> findAll() { return repository.findAll(); }
    public Optional<Reviews> findById(Long id) { return repository.findById(id); }
    public Reviews save(Reviews reviews) { return repository.save(reviews); }
    public void delete(Long id) { repository.deleteById(id); }
}
