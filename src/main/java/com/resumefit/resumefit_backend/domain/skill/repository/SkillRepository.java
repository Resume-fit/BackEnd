package com.resumefit.resumefit_backend.domain.skill.repository;

import com.resumefit.resumefit_backend.domain.skill.entity.Skill;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {}
