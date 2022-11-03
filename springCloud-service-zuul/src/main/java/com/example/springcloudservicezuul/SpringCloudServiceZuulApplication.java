package com.example.springcloudservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceZuulApplication.class, args);
    }

}
