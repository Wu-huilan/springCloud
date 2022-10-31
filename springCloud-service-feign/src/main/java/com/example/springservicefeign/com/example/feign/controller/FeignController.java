package com.example.springservicefeign.com.example.feign.controller;

import com.example.springservicefeign.com.example.feign.service.GoodRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    GoodRemoteClient goodRemoteClient;

    @GetMapping("/hello")
    public String hello() {
        return "Feign: "+goodRemoteClient.hello();

    }
}
