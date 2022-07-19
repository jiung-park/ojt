package com.tmax.ai.exception;

public class DuplicateUsernameException extends CustomException{

    public DuplicateUsernameException(ErrorCode errorCode) {
        super(errorCode);
    }

    public DuplicateUsernameException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public DuplicateUsernameException() {
        super(ErrorCode.DUPLICATE_USERNAME);
    }
}
