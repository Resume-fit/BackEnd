package com.resumefit.resumefit_backend.domain.skill.entity;

import com.resumefit.resumefit_backend.domain.jobPostingSkill.entity.JobPostingSkill;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Skill {

    @Id private Long id;

    private String name;
    private String category;
    private String image;

    @OneToMany(mappedBy = "skill")
    private List<JobPostingSkill> jobPostings = new ArrayList<>();
}
