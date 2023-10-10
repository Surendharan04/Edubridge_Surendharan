package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
//@Table(name="Project_Table")
public class Project {
	@Id
	private int projectId;
	@Column(length=30)
	private String projectName;
	
	@ManyToMany (mappedBy = "projects")
	List<Employee> employees;	//Many employees can work on many p
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Project(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}
	
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + "]";
	}
	
}
