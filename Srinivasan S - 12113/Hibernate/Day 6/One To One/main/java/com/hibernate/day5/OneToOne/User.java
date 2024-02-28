package com.hibernate.day5.OneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	
	@Column
	private String uName;
	@Column
	
	
	
	
	
	
	private String uCity;
	
	@OneToOne(targetEntity = Details.class,cascade = CascadeType.ALL)

	private Details d;
	
	
	public User() {
		
	}
	
	
	public User( String uName, String uCity, Details d) {
		super();
		
		this.uName = uName;
		this.uCity = uCity;
		this.d = d;
	}


	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	public String getuName() {
		return uName;
	}


	public void setuName(String uName) {
		this.uName = uName;
	}


	public String getuCity() {
		return uCity;
	}


	public void setuCity(String uCity) {
		this.uCity = uCity;
	}


	public Details getD() {
		return d;
	}


	public void setD(Details d) {
		this.d = d;
	}


	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uCity=" + uCity + ", d=" + d + "]";
	}

	
}
