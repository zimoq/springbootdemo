package com.ahead.springbootdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.ahead.controller","com.ahead.job","com.ahead.dao"})
public class Springbootdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo2Application.class, args);
    }

}
