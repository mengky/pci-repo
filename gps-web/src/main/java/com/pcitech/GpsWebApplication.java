package com.pcitech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GpsWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(GpsWebApplication.class, args);
    }
}
