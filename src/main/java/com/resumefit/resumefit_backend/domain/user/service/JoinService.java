package com.resumefit.resumefit_backend.domain.user.service;

import com.resumefit.resumefit_backend.domain.user.dto.JoinRequestDto;
import com.resumefit.resumefit_backend.domain.user.entity.User;
import com.resumefit.resumefit_backend.domain.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void joinProcess(JoinRequestDto joinDto) {
        // 1. 로그인 아이디 중복 검사
        if (userRepository.existsByEmail(joinDto.getEmail())) {
            // 실제 프로젝트에서는 Custom Exception을 사용하는 것이 좋습니다.
            throw new IllegalArgumentException("이미 사용 중인 아이디입니다.");
        }

        // 2. DTO를 Entity로 변환
        User user = new User();

        user.setEmail(joinDto.getEmail());
        user.setName(joinDto.getName());
        user.setBirth(joinDto.getBirth());
        user.setPhoneNumber(joinDto.getPhoneNumber());
        user.setPassword(bCryptPasswordEncoder.encode(joinDto.getPassword()));
        user.setAcademic(joinDto.getAcademic());
        user.setSchoolName(joinDto.getSchoolName());
        user.setMajor(joinDto.getMajor());
        user.setRole("ROLE_USER");

        // 4. DB에 저장
        userRepository.save(user);
    }
}
