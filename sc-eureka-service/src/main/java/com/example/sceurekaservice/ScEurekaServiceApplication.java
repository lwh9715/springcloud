package com.example.sceurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author relax
 */
@EnableEurekaServer
@SpringBootApplication
public class ScEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaServiceApplication.class, args);
    }

}
