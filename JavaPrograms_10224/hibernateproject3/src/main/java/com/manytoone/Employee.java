package com.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeTable")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	@Column(length = 30,nullable=false)
	private String empName;
	@Column(nullable=false)
	private int empAge;
	@Column(nullable=false)
	private float empSalary;
	
	@ManyToOne
	@JoinColumn(name="departmentid")
	private Department department;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String empName, int empAge, float empSalary) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + 
				", empSalary=" + empSalary + "]";
	}
}
