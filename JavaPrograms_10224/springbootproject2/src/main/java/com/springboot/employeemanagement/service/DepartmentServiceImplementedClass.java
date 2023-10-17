package com.springboot.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.employeemanagement.dao.Department;
import com.springboot.employeemanagement.repository.DepartmentRepository;

@Service
public class DepartmentServiceImplementedClass implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	
	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Integer departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public String deleteDepartmentById(Integer departmentId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentId);
		return "Record is Deleted";
	}

	@Override
	public List<Department> deleteByIdandShowtheRemainingRecords(Integer departmentId) {
		departmentRepository.deleteById(departmentId);
		return departmentRepository.findAll();
	}

	@Override
	public Department updateDepartment(Integer departmentId, Department department) {
		// TODO Auto-generated method stub
		Department dept = departmentRepository.findById(departmentId).get();
		if(dept != null) {
			dept.setDepartmentName(department.getDepartmentName());
			dept.setDepartmentLocation(department.getDepartmentLocation());
		}
		departmentRepository.save(dept);
		
		return dept;
	}
}
