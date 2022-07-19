package com.tmax.ai.exception;

public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 1L; // 무엇에 쓰이는지 확인 필요

    private ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public CustomException(String message, ErrorCode errorCode) {
        super(errorCode.getMessage() + message);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
