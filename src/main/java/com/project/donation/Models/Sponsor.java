package com.project.donation.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSponsor;
    private String sponsorName;

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public Long getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(Long idSponsor) {
        this.idSponsor = idSponsor;
    }
}
