package com.test.aws.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.aws.pojo.Employee;

@Service
public interface EmployeeService {

	Employee saveEmployee(Employee e);

	List<Employee> getAllEmployees();

}
