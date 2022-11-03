package com.example.springcloudservicedashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringCloudServiceDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceDashboardApplication.class, args);
	}

}
