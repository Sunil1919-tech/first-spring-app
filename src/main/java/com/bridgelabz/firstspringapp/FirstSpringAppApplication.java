package com.bridgelabz.firstspringapp;

import com.bridgelabz.firstspringapp.components.EmployeeBean;
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
        logger.debug("Hello from Bridgelabz");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEmpId(123);
        employeeBean.setEmpName("Spring Guru");
        employeeBean.showEmpDetails();
    }
}
