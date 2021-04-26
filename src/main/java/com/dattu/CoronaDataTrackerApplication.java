package com.dattu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaDataTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronaDataTrackerApplication.class, args);
    }

}
