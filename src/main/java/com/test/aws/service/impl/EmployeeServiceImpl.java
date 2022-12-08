package com.test.aws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.aws.pojo.Employee;
import com.test.aws.repo.EmployeeRepo;
import com.test.aws.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepo repo;

	@Override
	public Employee saveEmployee(Employee e) {

		return repo.save(e);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

}
