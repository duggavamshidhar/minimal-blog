package com.duggavamshidhar.minimalblog.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("message", "Site is up and running");
    }

}
