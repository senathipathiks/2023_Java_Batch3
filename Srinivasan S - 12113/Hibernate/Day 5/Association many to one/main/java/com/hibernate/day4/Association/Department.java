package com.hibernate.day4.Association;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Dept")
public class Department {
@Id
private int dId;
private String dName;

public Department() {
	super();
	// TODO Auto-generated constructor stub
}

public Department(int dId, String dName) {
	super();
	this.dId = dId;
	this.dName = dName;
}

public int getdId() {
	return dId;
}

public void setdId(int dId) {
	this.dId = dId;
}

public String getdName() {
	return dName;
}

public void setdName(String dName) {
	this.dName = dName;
}

@Override
public String toString() {
	return "Department [dId=" + dId + ", dName=" + dName + "]";
}




}
