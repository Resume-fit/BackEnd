package com.resumefit.resumefit_backend.domain.jobPostingSkill.entity;

import com.resumefit.resumefit_backend.domain.jobposition.entity.JobPosition;
import com.resumefit.resumefit_backend.domain.jobposition.entity.SkillType;
import com.resumefit.resumefit_backend.domain.skill.entity.Skill;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class JobPostingSkill {

    @Id private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SkillType type; // 필수, 우대 구분
}
