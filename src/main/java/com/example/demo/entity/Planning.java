package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Planning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlanning;

    @ManyToOne
    @JoinColumn(name = "id_manager")
    private Manager manager;

    private String vacationStart;
    private String vacationEnd;
    private String workDay;
    private String workOff;
    private String schedule;

    // Getters and Setters
    public Long getIdPlanning() { return idPlanning; }
    public void setIdPlanning(Long idPlanning) { this.idPlanning = idPlanning; }
    public Manager getManager() { return manager; }
    public void setManager(Manager manager) { this.manager = manager; }
    public String getVacationStart() { return vacationStart; }
    public void setVacationStart(String vacationStart) { this.vacationStart = vacationStart; }
    public String getVacationEnd() { return vacationEnd; }
    public void setVacationEnd(String vacationEnd) { this.vacationEnd = vacationEnd; }
    public String getWorkDay() { return workDay; }
    public void setWorkDay(String workDay) { this.workDay = workDay; }
    public String getWorkOff() { return workOff; }
    public void setWorkOff(String workOff) { this.workOff = workOff; }
    public String getSchedule() { return schedule; }
    public void setSchedule(String schedule) { this.schedule = schedule; }
}
