package com.mapping.relation.HibernateMapping;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy="vehicle")
	private Collection<User> user=new ArrayList<>();;


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
	public Collection<User> getUser() {
		return user;
	}
	public void setUser(Collection<User> user) {
		this.user = user;
	}
}