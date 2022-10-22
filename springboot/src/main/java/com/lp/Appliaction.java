package com.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Appliaction {

    public static void main(String[] args) {
        SpringApplication.run(Appliaction.class,args);
    }

}
