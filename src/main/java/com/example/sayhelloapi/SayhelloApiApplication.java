package com.example.sayhelloapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.sayhelloapi", "sayhello"})
public class SayhelloApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SayhelloApiApplication.class, args);
    }
}

