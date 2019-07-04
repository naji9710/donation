package com.project.donation.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDonation;

    @ManyToOne
    private User user;
    @ManyToOne
    private Project project;

    public Long getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(Long idDonation) {
        this.idDonation = idDonation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
