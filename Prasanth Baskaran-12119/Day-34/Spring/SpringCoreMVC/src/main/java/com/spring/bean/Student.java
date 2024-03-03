package com.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
       
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private int id;
	   public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	private String name;
	   private String email;
	   private String phone;
	   
	   
	   public Student() {
			super();
			
		}


	public Student(String name, String email, String phone) {
		//super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	   
	   
	
}
