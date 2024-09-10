package com.areastory.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/health-check")
public class HealthCheckController {

    @GetMapping
    public String healthCheck() {
        return "user health check";
    }
}
