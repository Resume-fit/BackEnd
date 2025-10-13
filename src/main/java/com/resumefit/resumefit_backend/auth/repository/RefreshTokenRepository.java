package com.resumefit.resumefit_backend.auth.repository;

import com.resumefit.resumefit_backend.auth.entity.RefreshToken;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByTokenValue(String refreshTokenValue);

    Optional<RefreshToken> findByEmail(String email);
}
