package com.springboot.employeemanagement.service;

import java.util.List;

import com.springboot.employeemanagement.dao.Department;

public interface DepartmentService {

	public Department addDepartment(Department department);
	public List<Department> getAllDepartments();
	public Department getDepartmentById(Integer departmentId);
	public String deleteDepartmentById(Integer departmentId);
	public List<Department> deleteByIdandShowtheRemainingRecords(Integer departmentId);
	public Department updateDepartment(Integer departmentId, Department department);
}
