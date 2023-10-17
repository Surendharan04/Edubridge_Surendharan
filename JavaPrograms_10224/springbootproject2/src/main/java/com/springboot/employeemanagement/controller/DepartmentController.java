package com.springboot.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.employeemanagement.dao.Department;
import com.springboot.employeemanagement.service.DepartmentService;

@RestController
public class DepartmentController {
	//Injects an Object of Service Interface that should be private
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/addDepartment")	//http://localhost:8990/addDepartment
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}
	
	@GetMapping("/getAllDepartments")	//http://localhost:8990/getAllDepartments
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/getDepartmentById/{did}")	//http://localhost:8990/getDepartmentbyId/[id]
	public Department getDepartmentById(@PathVariable("did") Integer departmentId) {
		return departmentService.getDepartmentById(departmentId);
	}
	
	@PutMapping("/updateDepartment/{did}")
	public Department updateDepartment(@PathVariable("did") Integer departmentId, @RequestBody Department department) {
		return departmentService.updateDepartment(departmentId, department);
	}
	
	@DeleteMapping("/deleteDepartmentById/{did}")	//http://localhost:8990/deleteDepartmentById/[id]
	public String deleteDepartmentById(@PathVariable("did") Integer departmentId) {
		return departmentService.deleteDepartmentById(departmentId);
	}
	
	@DeleteMapping("/deleteByIdandShowtheRemainingRecords/{did}")	//http://localhost:8990/deleteByIdandShowtheRemainingRecords/[id]
	public List<Department> deleteByIdandShowtheRemainingRecords(@PathVariable("did") Integer departmentId){
		return departmentService.deleteByIdandShowtheRemainingRecords(departmentId);
	}
}
