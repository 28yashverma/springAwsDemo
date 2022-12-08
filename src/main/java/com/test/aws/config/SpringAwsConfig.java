package com.test.aws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.aws.service.EmployeeService;
import com.test.aws.service.impl.EmployeeServiceImpl;

@Configuration
public class SpringAwsConfig {

	@Bean
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl();
	}

}
