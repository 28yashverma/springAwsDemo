package com.test.aws.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.aws.pojo.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
