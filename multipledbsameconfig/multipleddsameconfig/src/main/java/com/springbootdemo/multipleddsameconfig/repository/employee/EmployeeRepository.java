package com.springbootdemo.multipleddsameconfig.repository.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.multipleddsameconfig.model.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}