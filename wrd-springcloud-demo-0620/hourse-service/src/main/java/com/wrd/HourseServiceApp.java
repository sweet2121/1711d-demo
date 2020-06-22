package com.wrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HourseServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(HourseServiceApp.class,args);
    }
}
