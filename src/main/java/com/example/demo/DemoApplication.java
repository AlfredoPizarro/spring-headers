package com.example.demo;

mport org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @RestController
    public class HelloWorldController {

        @GetMapping("/")
        public String helloWorld(HttpServletResponse response) {
            // Set custom header
            response.setHeader("X-Frame-Options", "DENY");
            return "Hello world!";
        }
    }
}
