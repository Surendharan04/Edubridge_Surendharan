package com.springboot.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.employeemanagement.dao.Employee;
import com.springboot.employeemanagement.error.GlobalException;
import com.springboot.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PutMapping("/updateEmployeeDepartment/eid/{eid}/did/{did}")
	public Employee updateEmployeeDepartment(@PathVariable("eid") Integer employeeId, @PathVariable("did") Integer departmentId) {
		return employeeService.updateEmployeeDepartment(employeeId, departmentId);
	}
	
	@GetMapping("/getEmployeeById/{eid}")
	public Employee getEmployeeById(@PathVariable("eid") Integer employeeId) throws GlobalException {
		return employeeService.getEmployeeById(employeeId);
	}
	
	@DeleteMapping("/deleteEmployeeById/{eid}")
	public String deleteEmployeeById(@PathVariable("eid") Integer employeeId) throws GlobalException {
		return employeeService.deleteEmployeeById(employeeId);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
}
