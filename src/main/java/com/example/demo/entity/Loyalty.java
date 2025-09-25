package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Loyalty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLoyalty;

    @OneToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    private int totalPoints;

    @ManyToMany
    @JoinTable(
            name = "loyalty_reward",
            joinColumns = @JoinColumn(name = "id_loyalty"),
            inverseJoinColumns = @JoinColumn(name = "id_reward")
    )
    private List<Reward> rewards;

    // Getters and Setters
    public Long getIdLoyalty() { return idLoyalty; }
    public void setIdLoyalty(Long idLoyalty) { this.idLoyalty = idLoyalty; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public int getTotalPoints() { return totalPoints; }
    public void setTotalPoints(int totalPoints) { this.totalPoints = totalPoints; }
    public List<Reward> getRewards() { return rewards; }
    public void setRewards(List<Reward> rewards) { this.rewards = rewards; }
}
