package com.springboot.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employeemanagement.dao.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
