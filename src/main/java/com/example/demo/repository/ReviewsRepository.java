package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Reviews;


public interface ReviewsRepository extends JpaRepository<Reviews, Long> { }