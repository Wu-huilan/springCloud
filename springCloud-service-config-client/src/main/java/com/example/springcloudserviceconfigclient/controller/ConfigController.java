package com.example.springcloudserviceconfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @Value("${url}")//读取远程配置中心配置的信息
    private String url;
    @Autowired
    private Environment env;
    @RequestMapping("/cloud/url")
    public String url () {
        return this.url;
    }
    @RequestMapping("/cloud/url2")
    public String url2 () {
        return env.getProperty("url");
    }
}

