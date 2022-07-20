package com.tmax.ai.exception;

public class InvalidFormulaException extends CustomException{

    public InvalidFormulaException(ErrorCode errorCode) {
        super(errorCode);
    }

    public InvalidFormulaException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public InvalidFormulaException() {
        super(ErrorCode.INVLAID_FORMULA);
    }

}
