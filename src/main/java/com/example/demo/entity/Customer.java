package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;

    private String identity;
    private String password;
    private String mail;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "customer")
    private List<Reviews> reviews;

    @OneToOne(mappedBy = "customer")
    private Loyalty loyalty;

    // Getters and Setters
    public Long getIdCustomer() { return idCustomer; }
    public void setIdCustomer(Long idCustomer) { this.idCustomer = idCustomer; }
    public String getIdentity() { return identity; }
    public void setIdentity(String identity) { this.identity = identity; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public List<Reservation> getReservations() { return reservations; }
    public void setReservations(List<Reservation> reservations) { this.reservations = reservations; }
    public List<Reviews> getReviews() { return reviews; }
    public void setReviews(List<Reviews> reviews) { this.reviews = reviews; }
    public Loyalty getLoyalty() { return loyalty; }
    public void setLoyalty(Loyalty loyalty) { this.loyalty = loyalty; }
}
