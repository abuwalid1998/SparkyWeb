package com.sparky.webpage.webpage;

import Controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = Controller.class)
public class WebPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebPageApplication.class, args);
    }

}
