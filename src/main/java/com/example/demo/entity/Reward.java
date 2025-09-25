package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReward;

    private double discount;

    @ManyToMany(mappedBy = "rewards")
    private List<Loyalty> loyalties;

    // Getters and Setters
    public Long getIdReward() { return idReward; }
    public void setIdReward(Long idReward) { this.idReward = idReward; }
    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }
    public List<Loyalty> getLoyalties() { return loyalties; }
    public void setLoyalties(List<Loyalty> loyalties) { this.loyalties = loyalties; }
}
