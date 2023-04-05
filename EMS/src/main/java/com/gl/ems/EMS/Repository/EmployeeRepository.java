package com.gl.ems.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.ems.EMS.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
