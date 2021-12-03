package com.bridgelabz.firstspringapp;

import com.bridgelabz.firstspringapp.components.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FirstSpringAppApplication {
    public static final Logger logger = LoggerFactory.getLogger(FirstSpringAppApplication.class);

    public static void main(String[] args) {
        System.out.println("Welcome to My first Spring Application");
        ApplicationContext context = SpringApplication.run(FirstSpringAppApplication.class, args);
        logger.debug("Checking Context:" + context.getBean(DemoBean.class));
        logger.debug("\n**** Example using @autoWire annotation on property ***");
//		SpringApplication.run(FirstSpringAppApplication.class);
        logger.debug("Hello from Bridgelabz");
    }
}
