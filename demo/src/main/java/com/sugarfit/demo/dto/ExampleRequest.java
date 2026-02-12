package com.sugarfit.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ExampleRequest {

    @NotBlank(message = "userId cannot be blank")
    private String userId;

    @NotNull(message = "value cannot be null")
    private Integer value;

    public String getUserId() {
        return userId;
    }

    public Integer getValue() {
        return value;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
