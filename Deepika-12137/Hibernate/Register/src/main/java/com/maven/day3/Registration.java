package com.maven.day3;

import javax.persistence.*;



@Entity
@Table(name="Registration")
public class Registration{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column (name="username")
private String username;
@Column (name="password")
private String password;

public Registration(int id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}

public Registration() {
	super();
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
	
}

