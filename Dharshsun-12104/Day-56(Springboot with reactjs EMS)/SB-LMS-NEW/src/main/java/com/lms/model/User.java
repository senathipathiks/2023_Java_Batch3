package com.lms.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private int uage;

	@ManyToOne(targetEntity = Library.class, cascade = CascadeType.REFRESH)
	@JoinColumn(name="lid")
	private Library lib;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String uname, int uage, Library lib) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
		this.lib = lib;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public Library getLib() {
		return lib;
	}

	public void setLib(Library lib) {
		this.lib = lib;
	}
	
	
	
	

}
