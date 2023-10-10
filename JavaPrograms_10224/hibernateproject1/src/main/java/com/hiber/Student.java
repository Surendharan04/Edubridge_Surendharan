package com.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	//Entity will map this class to table in the database
public class Student {
	@Id //Makes the attribute as primary key
	private int studentId;
	private String studentName;
	private int studentAge;
	private float studentFees;
	
	//Template to follow to create entity in hibernate:
	//1.Generate constructor - No arg constructor (Super Class)
	//2.Generate constructor with arguments
	//3.Generate Getter and Setter methods
	//4.Generate toString() method
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(int studentId, String studentName, int studentAge, float studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentFees = studentFees;
	}
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public float getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(float studentFees) {
		this.studentFees = studentFees;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentFees=" + studentFees + "]";
	}
	
}
