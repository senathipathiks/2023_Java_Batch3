package com.web.day3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registration")
public class Registration {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String username;

private String password;
/**
* @param id
* @param username
* @param password
*/
public Registration(int id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
/**
*
*/
public Registration() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Registration [id=" + id + ", username=" + username + ", password=" + password + "]";
}
 
 
}