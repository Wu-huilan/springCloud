package com.example.springcloudserviceportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PortalController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/portal")
    public String hello(){
        ResponseEntity<String> entity = restTemplate.getForEntity("http://springCloud-service-good/hello", String.class);
        return entity.getBody();
    }
}
