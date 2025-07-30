package com.action.springgitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringgitactionApplication {

    public String check() {
        return "helow world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringgitactionApplication.class, args);
    }

}
