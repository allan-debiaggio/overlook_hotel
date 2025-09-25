package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class KPI {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idKpi;

    @OneToOne
    @JoinColumn(name = "id_review")
    private Reviews review;

    @ManyToOne
    @JoinColumn(name = "id_loyalty")
    private Loyalty loyalty;

    @ManyToOne
    @JoinColumn(name = "id_room")
    private Room room;

    private double occupationRate;
    private double averageRating;
    private int loyalCustomers;

    // Getters and Setters
    public Long getIdKpi() { return idKpi; }
    public void setIdKpi(Long idKpi) { this.idKpi = idKpi; }
    public Reviews getReview() { return review; }
    public void setReview(Reviews review) { this.review = review; }
    public Loyalty getLoyalty() { return loyalty; }
    public void setLoyalty(Loyalty loyalty) { this.loyalty = loyalty; }
    public Room getRoom() { return room; }
    public void setRoom(Room room) { this.room = room; }
    public double getOccupationRate() { return occupationRate; }
    public void setOccupationRate(double occupationRate) { this.occupationRate = occupationRate; }
    public double getAverageRating() { return averageRating; }
    public void setAverageRating(double averageRating) { this.averageRating = averageRating; }
    public int getLoyalCustomers() { return loyalCustomers; }
    public void setLoyalCustomers(int loyalCustomers) { this.loyalCustomers = loyalCustomers; }
}
