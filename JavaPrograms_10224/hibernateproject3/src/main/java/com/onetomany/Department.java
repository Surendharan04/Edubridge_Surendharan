package com.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DepartmentTable")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deptId;
	@Column(nullable=false,length=20)
	private String deptName;
	@Column(nullable=false,length=20)
	private String deptLocation;
	
	@OneToOne(mappedBy = "department")
	private Employee employee;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName, String deptLocation) {
		super();
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptLocation=" + deptLocation +"s]";
	}
}
