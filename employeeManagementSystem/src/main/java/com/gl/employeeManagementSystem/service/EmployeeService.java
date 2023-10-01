package com.gl.employeeManagementSystem.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.gl.employeeManagementSystem.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Long id);

	
}
