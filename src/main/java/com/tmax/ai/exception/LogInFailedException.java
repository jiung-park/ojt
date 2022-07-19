package com.tmax.ai.exception;

public class LogInFailedException extends CustomException{

    public LogInFailedException(ErrorCode errorCode) {
        super(errorCode);
    }

    public LogInFailedException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public LogInFailedException() {
        super(ErrorCode.LOG_IN_FAILED);
    }

}
