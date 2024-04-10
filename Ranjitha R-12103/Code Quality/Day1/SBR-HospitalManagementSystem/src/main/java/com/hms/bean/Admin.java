package com.hms.bean;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String aname;
	private String city;
	private String email;
	private String phoneNo;
	
	@OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
	//@OneToMany(mappedBy = "admin",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Hospital> hospital;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int aid, String aname, String city, String email, String phoneNo) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.city = city;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
