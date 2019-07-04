package com.project.donation.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAssociation;
    private String associationName;

    public Long getIdAssociation() {
        return idAssociation;
    }

    public void setIdAssociation(Long idAssociation) {
        this.idAssociation = idAssociation;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }
}
