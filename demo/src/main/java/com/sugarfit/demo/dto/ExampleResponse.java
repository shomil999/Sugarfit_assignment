package com.sugarfit.demo.dto;

public class ExampleResponse {

    private String status;
    private String requestId;

    public ExampleResponse(String status, String requestId) {
        this.status = status;
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public String getRequestId() {
        return requestId;
    }
}
