package com.example.springservicefeign.com.example.feign.controller;

import com.example.springservicefeign.com.example.feign.service.GoodRemoteClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    GoodRemoteClient goodRemoteClient;

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "fallback",
                    threadPoolKey = "goods",
                    threadPoolProperties = {@HystrixProperty(name = "coreSize", value = "2"),
                    @HystrixProperty(name = "maxQueueSize", value = "1")}
    )
    public String hello() {
        return "Feign: "+goodRemoteClient.hello();
    }

    public String fallback(Throwable throwable) {
        return "降流了";
    }
}
