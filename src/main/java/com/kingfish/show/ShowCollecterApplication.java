package com.kingfish.show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
@RestController
public class ShowCollecterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowCollecterApplication.class, args);
    }
}
