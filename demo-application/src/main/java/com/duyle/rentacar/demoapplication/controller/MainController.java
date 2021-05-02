package com.duyle.rentacar.demoapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value = "/hello")
    public String greeting() {
        return "Hello Springboot";
    }
}
