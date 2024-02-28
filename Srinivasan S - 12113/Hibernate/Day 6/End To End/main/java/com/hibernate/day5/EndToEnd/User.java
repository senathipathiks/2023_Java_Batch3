package com.hibernate.day5.EndToEnd;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="User")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int uId;
	@Column
	private String userName;
	
	
	// mapping address class
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_Id")
	private Address address;
	
	//mapping mobile class
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="user_mobile",joinColumns = @JoinColumn(name="user_Id"),inverseJoinColumns = @JoinColumn(name="mobile_Id"))
	private Set<Mobile> mob=new HashSet<Mobile>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="user_vehicle",joinColumns = @JoinColumn(name="user_Id"),inverseJoinColumns = @JoinColumn(name="vehicle_Id"))
	private Set<Vehicle> veh=new HashSet<Vehicle>();
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(int uId, String userName) {
		super();
		this.uId = uId;
		this.userName = userName;
	}


	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Set<Mobile> getMob() {
		return mob;
	}


	public void setMob(Set<Mobile> mob) {
		this.mob = mob;
	}


	public Set<Vehicle> getVeh() {
		return veh;
	}


	public void setVeh(Set<Vehicle> veh) {
		this.veh = veh;
	}


	@Override
	public String toString() {
		return "User [uId=" + uId + ", userName=" + userName + "]";
	}
	
	

}
