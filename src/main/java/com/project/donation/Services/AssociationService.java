package com.project.donation.Services;

import com.project.donation.Models.Association;

import java.util.List;

public interface AssociationService {
    List<Association> getAllAssocations();

    boolean createAssociation(Association association);

    boolean updateAssociation(Long idAssociation, Association association);

    boolean deleteAssociation(Long idAssociation);
}
