package com.resumefit.resumefit_backend.domain.jobposition.entity;

import lombok.Getter;

@Getter
public enum JobCategory {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드"),
    MOBILE("모바일"),
    DATA("데이터"),
    DEVOPS_INFRA("DevOps/인프라"),
    QA("QA/테스트"),
    AI_ML("AI/머신러닝"),
    SECURITY("보안"),
    GAME("게임 개발"),
    EMBEDDED("임베디드"),
    FULL_STACK("풀스택"),
    ETC("기타");

    private final String displayName;

    JobCategory(String displayName) {
        this.displayName = displayName;
    }
}
