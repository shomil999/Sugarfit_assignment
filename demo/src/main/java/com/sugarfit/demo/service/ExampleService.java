package com.sugarfit.demo.service;

import com.sugarfit.demo.dto.ExampleRequest;
import com.sugarfit.demo.dto.ExampleResponse;
import com.sugarfit.demo.util.RequestIdHolder;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public ExampleResponse process(ExampleRequest request) {

        String requestId = RequestIdHolder.getRequestId();

        return new ExampleResponse("SUCCESS", requestId);
    }
}
