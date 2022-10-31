package com.example.springservicefeign.com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRINGCLOUD-SERVICE-GOOD")
public interface GoodRemoteClient {

    @GetMapping("/hello")
    public String hello();
}
