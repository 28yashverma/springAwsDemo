package com.test.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.aws.pojo.Employee;
import com.test.aws.service.EmployeeService;

@RestController
public class SpringAwsController {

	@Autowired
	public EmployeeService service;

	@GetMapping("/greeting")
	public String greeting() {
		return "Hello from Spring Aws Controller";
	}

	@RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee e) {
		if (e != null) {
			return service.saveEmployee(e);
		}

		return e;
	}

	@RequestMapping(value = "employees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

}
