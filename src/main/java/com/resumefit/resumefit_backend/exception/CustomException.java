package com.resumefit.resumefit_backend.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    int errorCode;

    public CustomException(ErrorCode errorCode) {
    }
}
