package com.example.testjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class TestJmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJmsApplication.class, args);
    }

}
