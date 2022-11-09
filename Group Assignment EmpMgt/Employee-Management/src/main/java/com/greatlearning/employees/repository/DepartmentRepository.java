package com.greatlearning.employees.repository;

import org.springframework.data.repository.CrudRepository;
import com.greatlearning.employees.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
