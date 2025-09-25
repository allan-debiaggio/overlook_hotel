package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Installation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInstallation;

    private String name;
    private String description;

    @ManyToMany(mappedBy = "installations")
    private List<Event> events;

    // Getters and Setters
    public Long getIdInstallation() { return idInstallation; }
    public void setIdInstallation(Long idInstallation) { this.idInstallation = idInstallation; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public List<Event> getEvents() { return events; }
    public void setEvents(List<Event> events) { this.events = events; }
}
