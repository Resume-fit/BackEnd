package com.resumefit.resumefit_backend.domain.jobposition.entity;

import lombok.Getter;

@Getter
public enum EmploymentType {
    FULL_TIME("정규직"),
    CONTRACT("계약직"),
    INTERN("인턴"),
    FREELANCER("프리랜서"),
    MILITARY_SERVICE_ALTERNATIVE("병역특례"),
    PART_TIME("파트타임"),
    ETC("기타");

    private final String displayName;

    EmploymentType(String displayName) {
        this.displayName = displayName;
    }
}
