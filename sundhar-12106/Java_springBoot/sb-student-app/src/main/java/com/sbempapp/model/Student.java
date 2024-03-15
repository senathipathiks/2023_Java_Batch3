package com.sbempapp.model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	@Lob
	@Column(columnDefinition = "BLOB",length = 100000)
	private byte[] picture;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, String type, byte[] picture) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.picture = picture;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public byte[] getPicture() {
		return picture;
	}


	public void setPicture(byte[] picture) {
		this.picture = picture;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", type=" + type + ", picture=" + Arrays.toString(picture)
				+ "]";
	}
	
	

}
