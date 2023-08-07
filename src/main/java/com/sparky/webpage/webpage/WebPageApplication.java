package com.sparky.webpage.webpage;

import Controller.WebController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = WebController.class)
public class WebPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebPageApplication.class, args);
    }

}
