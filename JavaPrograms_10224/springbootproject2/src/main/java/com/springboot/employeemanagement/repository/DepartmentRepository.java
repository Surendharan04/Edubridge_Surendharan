package com.springboot.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employeemanagement.dao.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
}
