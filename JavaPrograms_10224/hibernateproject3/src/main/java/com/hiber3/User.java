package com.hiber3;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int userId;
	@Column(name="Username",nullable=false,length=30)
	private String userName;
	@Column(name="Userage",nullable=false)
	private int userAge;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private Country country;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int userId, String userName, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + "]";
	}
	
	
	
}
