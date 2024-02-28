package com.hibernate.day5.EndToEnd;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Vehicle")

public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		
	private int vId;
	@Column
	private String vName;
	
	@ManyToMany(targetEntity = User.class, cascade = CascadeType.ALL)
	private Set<User> user=new HashSet<User>();
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vId, String vName) {
		super();
		this.vId = vId;
		this.vName = vName;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vName=" + vName + ", user=" + user + "]";
	}
	
	
}
