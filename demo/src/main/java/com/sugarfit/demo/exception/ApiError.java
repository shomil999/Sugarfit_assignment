package com.sugarfit.demo.exception;

public class ApiError {

    private String code;
    private String message;
    private String requestId;

    public ApiError(String code, String message, String requestId) {
        this.code = code;
        this.message = message;
        this.requestId = requestId;
    }

    public String getCode() { return code; }
    public String getMessage() { return message; }
    public String getRequestId() { return requestId; }
}
