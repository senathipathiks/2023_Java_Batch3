package com.webapp.day1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String username;
	private String pass;
	private String cpass;
	private String phnno;
	private String city;
	
	
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Register(int id, String username, String pass, String cpass, String phnno, String city) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.cpass = cpass;
		this.phnno = phnno;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getCpass() {
		return cpass;
	}


	public void setCpass(String cpass) {
		this.cpass = cpass;
	}


	public String getPhnno() {
		return phnno;
	}


	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
