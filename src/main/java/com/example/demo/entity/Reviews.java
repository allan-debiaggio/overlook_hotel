package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReview;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    private int rating;
    private String commentary;
    private String answer;

    @OneToOne(mappedBy = "review")
    private KPI kpi;  // Optional: if KPI references review

    // Getters and Setters
    public Long getIdReview() { return idReview; }
    public void setIdReview(Long idReview) { this.idReview = idReview; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    public String getCommentary() { return commentary; }
    public void setCommentary(String commentary) { this.commentary = commentary; }
    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }
    public KPI getKpi() { return kpi; }
    public void setKpi(KPI kpi) { this.kpi = kpi; }
}
