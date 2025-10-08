package com.resumefit.resumefit_backend.domain.resume.repository;

import com.resumefit.resumefit_backend.domain.resume.entity.Resume;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {}
