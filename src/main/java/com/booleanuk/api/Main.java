package com.booleanuk.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// If annotation is missing, look for beans
@SpringBootApplication
public class Main   {
    public static void main(String[] args)   {
        SpringApplication.run(Main.class, args);
    }
}