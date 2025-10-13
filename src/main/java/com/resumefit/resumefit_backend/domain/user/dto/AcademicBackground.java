package com.resumefit.resumefit_backend.domain.user.dto;

import lombok.Getter;

@Getter
public enum AcademicBackground {
    HIGH_SCHOOL("고등학교 졸업"),
    ASSOCIATE_DEGREE("대학 졸업 (2, 3년)"),
    BACHELOR_DEGREE("대학교 졸업 (4년)"),
    MASTER_DEGREE("석사 졸업"),
    DOCTORATE_DEGREE("박사 졸업");

    private final String description;

    AcademicBackground(String description) {
        this.description = description;
    }
}
