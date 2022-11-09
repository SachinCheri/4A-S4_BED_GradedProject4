package com.greatlearning.employees.repository;

import org.springframework.data.repository.CrudRepository;

import com.greatlearning.employees.model.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}