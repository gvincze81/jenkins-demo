package com.example.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
        app();
    }

    private static void app()
    {
        System.out.println("Bite me stupid!!!!");
        System.out.println("Second line");
    }

}
