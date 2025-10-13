package com.resumefit.resumefit_backend.domain.user.controller;

import com.resumefit.resumefit_backend.domain.user.dto.JoinRequestDto;
import com.resumefit.resumefit_backend.domain.user.service.JoinService;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public ResponseEntity<String> joinProcess(@Valid @RequestBody JoinRequestDto joinDto) {
        joinService.joinProcess(joinDto);
        return ResponseEntity.ok("회원가입 요청이 성공적으로 완료되었습니다.");
    }
}
