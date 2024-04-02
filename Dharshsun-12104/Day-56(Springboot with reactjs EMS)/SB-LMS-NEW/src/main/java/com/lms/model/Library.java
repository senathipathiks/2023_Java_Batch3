package com.lms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_library")
public class Library {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int lid;
  private String bname;
  private int price;

  
 public Library() {
	super();
	// TODO Auto-generated constructor stub
}

public Library(int lid, String bname, int price) {
	super();
	this.lid = lid;
	this.bname = bname;
	this.price = price;
	
}

public int getLid() {
	return lid;
}

public void setLid(int lid) {
	this.lid = lid;
}

public String getBname() {
	return bname;
}

public void setBname(String bname) {
	this.bname = bname;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}




  
  
}

