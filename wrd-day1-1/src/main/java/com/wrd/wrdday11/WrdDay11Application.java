package com.wrd.wrdday11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@EnableEurekaServer
@SpringBootApplication
public class WrdDay11Application {

    public static void main(String[] args) {

        SpringApplication.run(WrdDay11Application.class, args);
    }

}
