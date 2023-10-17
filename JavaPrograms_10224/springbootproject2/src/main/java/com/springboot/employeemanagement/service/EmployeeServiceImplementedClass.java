package com.springboot.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.employeemanagement.dao.Department;
import com.springboot.employeemanagement.dao.Employee;
import com.springboot.employeemanagement.error.GlobalException;
import com.springboot.employeemanagement.repository.DepartmentRepository;
import com.springboot.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementedClass implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployeeDepartment(Integer employeeId, Integer departmentId) {
		// TODO Auto-generated method stub
		Employee emp = employeeRepository.findById(employeeId).get();
		Department dept = departmentRepository.findById(departmentId).get();
		
		emp.updateEmployeeDepartment(dept);
		employeeRepository.save(emp);
		return emp;
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) throws GlobalException {
		// TODO Auto-generated method stub
		//return employeeRepository.findById(employeeId).get();
		Optional<Employee> emp = employeeRepository.findById(employeeId);
		if(emp.isPresent()) {
			return emp.get();
		}
		throw new GlobalException("Employee id =" +employeeId+ " is not present");
	}

	@Override
	public String deleteEmployeeById(Integer employeeId) throws GlobalException {
		// TODO Auto-generated method stub
//		employeeRepository.deleteById(employeeId);
//		return "Employee is Deleted";
		
		Optional<Employee> emp = employeeRepository.findById(employeeId);
		if(emp.isPresent()) {
			employeeRepository.deleteById(employeeId);
			return "Employee is Deleted";
		}
		throw new GlobalException("Employee id =" +employeeId+ " is not present and deletion is not possible");
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
