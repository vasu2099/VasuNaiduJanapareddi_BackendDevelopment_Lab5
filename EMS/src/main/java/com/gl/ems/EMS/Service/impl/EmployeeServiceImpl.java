package com.gl.ems.EMS.Service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gl.ems.EMS.Entity.Employee;
import com.gl.ems.EMS.Repository.EmployeeRepository;
import com.gl.ems.EMS.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
    private EmployeeRepository employeeRepository;
   
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }


    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    
}




