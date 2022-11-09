package com.greatlearning.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.employee.management")
public class EmployeeManagementApplication {

	static final Logger logger  = LogManager.getLogger(EmployeeManagementApplication.class.getName());
	
	public static void main(String[] args) {
		logger.info("entered application");
		SpringApplication.run(EmployeeManagementApplication.class, args);

	}

}
