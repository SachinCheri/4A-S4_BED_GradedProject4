package com.greatlearning.employees.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employees.model.Department;
import com.greatlearning.employees.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartments(){
		List<Department> depts = (List<Department>)departmentRepository.findAll(); 
		return depts;
	}

	public Optional<Department> getDepartment(int id){
		return departmentRepository.findById(id);
	}
	public void addDepartment(Department d) {
		departmentRepository.save(d);
	}
	public void updateDepartment(Department d, int id){
		if(id == d.getDepartment_ID()) {
			departmentRepository.save(d);
		}
	}
	public void deleteAllDepartment(){
		departmentRepository.deleteAll();
	}
	public void deleteDepartmentByID(int id){
		departmentRepository.deleteById(null);
	}
	public void patchDepartment(Department d, int id) {
		if(id == d.getDepartment_ID()) {
			departmentRepository.save(d);
		}
	}
}
