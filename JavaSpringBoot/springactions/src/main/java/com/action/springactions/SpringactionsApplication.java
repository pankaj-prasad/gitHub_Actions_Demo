package com.action.springactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringactionsApplication {

    public String check() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringactionsApplication.class, args);
    }

}
