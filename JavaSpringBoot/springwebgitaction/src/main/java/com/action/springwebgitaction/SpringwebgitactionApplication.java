package com.action.springwebgitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringwebgitactionApplication {

    @GetMapping("/ hello")
    public String check() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringwebgitactionApplication.class, args);
    }

}
