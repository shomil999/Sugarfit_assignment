package com.sugarfit.demo.controller;

import com.sugarfit.demo.dto.ExampleRequest;
import com.sugarfit.demo.dto.ExampleResponse;
import com.sugarfit.demo.service.ExampleService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping
    public ResponseEntity<ExampleResponse> process(
            @Valid @RequestBody ExampleRequest request) {

        return ResponseEntity.ok(exampleService.process(request));
    }
}
