package com.example.springcicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello World v2";
    }

    @GetMapping("/test")
    public String test(){
        return "Healthy";
    }
}
