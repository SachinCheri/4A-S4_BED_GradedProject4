package com.greatlearning.employees.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employees.model.Employee;
import com.greatlearning.employees.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll(); 
		return emps;
	}
	public Optional<Employee> getEmployee(int id){
		return employeeRepository.findById(id);
	}
	public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}
	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
	public void deleteAllEmployees(){
		employeeRepository.deleteAll();
	}
	public void deleteEmployeeByID(int id){
		employeeRepository.delete(null);
	}
	public void patchEmployee(Employee emp, int id) {
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
}
