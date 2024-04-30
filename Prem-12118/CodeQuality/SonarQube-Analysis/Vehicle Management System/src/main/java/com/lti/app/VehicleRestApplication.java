package com.lti.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleRestApplication.class, args);
        System.err.println("Application Started..");
    }

}

