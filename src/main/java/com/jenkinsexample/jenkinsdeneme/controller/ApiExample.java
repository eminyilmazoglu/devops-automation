package com.jenkinsexample.jenkinsdeneme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class ApiExample {

    @GetMapping("deneme")
    public String deneme() {
        return "Say Hello!!!";
    }
}
