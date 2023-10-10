package com.hiber3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CountryTable")
public class Country {
	@Id
	private int cid;
	@Column(name="CountryName",nullable=false,length=40)
	private String cname;
	
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Country(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}


	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}


	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + "]";
	}
}
