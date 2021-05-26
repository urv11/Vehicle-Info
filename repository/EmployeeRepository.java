package com.repository;

import java.util.List;
import java.util.Optional;

import com.example.model.Employee;

public interface EmployeeRepository {

	int save(Employee employee);
	int update(Employee employee);
	int deleteById(int id);
	List<Employee> findAll();
	List<Employee> findByNameAndSalary(String empName,long salary);
	Optional<Employee> findByEmpId(int id);
	String getNameByEmpId(int id);

}
