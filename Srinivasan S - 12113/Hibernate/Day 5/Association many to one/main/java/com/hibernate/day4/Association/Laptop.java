package com.hibernate.day4.Association;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptop {
@Id
private int lId;
private String lName;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(int lId, String lName) {
	super();
	this.lId = lId;
	this.lName = lName;
}
public int getlId() {
	return lId;
}
public void setlId(int lId) {
	this.lId = lId;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
@Override
public String toString() {
	return "Laptop [lId=" + lId + ", lName=" + lName + "]";
}

}
