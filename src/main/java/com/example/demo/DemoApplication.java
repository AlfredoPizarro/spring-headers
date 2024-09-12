package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    public class HelloWorldController {

        @GetMapping("/")
        public String helloWorld(HttpServletResponse response) {
            // Set custom header
            response.setHeader("    X-some-thing", "2");
            return "Hello world!";
        }
    }
}
