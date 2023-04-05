package com.gl.ems.EMS.Service;

import java.util.List;

import com.gl.ems.EMS.Entity.Employee;

public interface EmployeeService {
List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	   
	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Long id);

}

