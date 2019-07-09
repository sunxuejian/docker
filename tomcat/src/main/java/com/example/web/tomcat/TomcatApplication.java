package com.example.web.tomcat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TomcatApplication {

    @Value("${docker.msg}")
    private String msg;

    public static void main(String[] args) {
        SpringApplication.run(TomcatApplication.class, args);
    }


    @GetMapping("/hello")
    public String hello(){
        return msg;
    }
}
