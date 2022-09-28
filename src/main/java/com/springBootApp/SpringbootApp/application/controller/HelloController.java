package com.springBootApp.SpringbootApp.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello welcome to First API";
    }
}
