package com.resumefit.resumefit_backend.domain.user.entity;

import com.resumefit.resumefit_backend.domain.user.dto.AcademicBackground;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate birth;
    private String phoneNumber;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING) // DB에 enum 이름을 문자열로 저장
    private AcademicBackground academic;

    private String schoolName;
    private String major;
    private String role;
}
