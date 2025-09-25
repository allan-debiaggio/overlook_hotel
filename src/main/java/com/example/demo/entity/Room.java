package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRoom;

    private String type;
    private double price;
    private boolean availability;
    private String extras;

    @ManyToMany(mappedBy = "rooms")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "room")
    private List<KPI> kpis;

    // Getters and Setters
    public Long getIdRoom() { return idRoom; }
    public void setIdRoom(Long idRoom) { this.idRoom = idRoom; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public boolean isAvailability() { return availability; }
    public void setAvailability(boolean availability) { this.availability = availability; }
    public String getExtras() { return extras; }
    public void setExtras(String extras) { this.extras = extras; }
    public List<Reservation> getReservations() { return reservations; }
    public void setReservations(List<Reservation> reservations) { this.reservations = reservations; }
    public List<KPI> getKpis() { return kpis; }
    public void setKpis(List<KPI> kpis) { this.kpis = kpis; }
}
