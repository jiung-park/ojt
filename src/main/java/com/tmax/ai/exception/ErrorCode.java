package com.tmax.ai.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    DUPLICATE_USERNAME(HttpStatus.BAD_REQUEST, "중복된 아이디입니다."), // 기존 코드에서는 왜 int 형 인가
    INVLAID_FORMULA(HttpStatus.BAD_REQUEST, "수식이 계산할 수 없는 형태입니다."),
    LOG_IN_FAILED(HttpStatus.BAD_REQUEST, "로그인에 실패하였습니다.");

    private final String message;
    private final HttpStatus status;

    ErrorCode(final HttpStatus status, final String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}
