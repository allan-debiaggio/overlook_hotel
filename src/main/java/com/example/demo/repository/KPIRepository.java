package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.KPI;


public interface KPIRepository extends JpaRepository<KPI, Long> { }
