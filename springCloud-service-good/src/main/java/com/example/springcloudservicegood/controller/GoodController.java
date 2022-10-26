package com.example.springcloudservicegood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,I'm good";
    }
}
