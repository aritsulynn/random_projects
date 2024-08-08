package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    

    @CrossOrigin
    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }


    
}
