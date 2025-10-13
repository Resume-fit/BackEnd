package com.resumefit.resumefit_backend.domain.jobposition.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String positionName;
    private JobCategory jobCategory;

    private String workPlace;
    private EmploymentType employmentType;

    @Column(columnDefinition = "TEXT")
    private String mainJob;

    @OneToMany(mappedBy = "jobPosition", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Requirement> requirements = new ArrayList<>();

    private String url;
}
