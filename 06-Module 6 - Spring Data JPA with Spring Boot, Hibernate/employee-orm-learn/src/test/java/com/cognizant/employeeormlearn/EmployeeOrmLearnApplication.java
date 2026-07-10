package com.cognizant.employeeormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeOrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeOrmLearnApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EmployeeOrmLearnApplication.class, args);
        LOGGER.info("Inside main - Application started successfully");
    }
}
