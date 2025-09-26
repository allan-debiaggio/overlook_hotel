package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Loyalty;


public interface LoyaltyRepository extends JpaRepository<Loyalty, Long> { }