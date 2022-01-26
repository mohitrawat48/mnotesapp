package com.demo.mnotesapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String defaultRoute(){
        return "Hi, Welcome to M-Notes App test";
    }
}
