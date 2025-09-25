package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idManager;

    private String mail;
    private String password;

    @OneToMany(mappedBy = "manager")
    private List<Employee> employees;

    @OneToMany(mappedBy = "manager")
    private List<Planning> plannings;

    // Getters and Setters
    public Long getIdManager() { return idManager; }
    public void setIdManager(Long idManager) { this.idManager = idManager; }
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }
    public List<Planning> getPlannings() { return plannings; }
    public void setPlannings(List<Planning> plannings) { this.plannings = plannings; }
}
