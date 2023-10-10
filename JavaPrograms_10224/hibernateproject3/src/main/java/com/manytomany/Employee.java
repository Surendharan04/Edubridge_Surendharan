package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
//@Table(name="Employee_Table")
public class Employee {
	@Id
	private int empId;
	@Column(length=30)
	private String empName;
	
	@ManyToMany
	@JoinTable(name="empProject",
	joinColumns = {@JoinColumn(name="employeeId")},
	inverseJoinColumns = {@JoinColumn(name="projectId")}
	)
	List<Project> projects;	//Many projects can be assigned to many Employees
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
}
