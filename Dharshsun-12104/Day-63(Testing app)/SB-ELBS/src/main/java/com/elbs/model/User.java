package com.elbs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserTable")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String userLocation;
	private String userSubsidies;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "tariffId")
	private Tariff tariff;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "billNo")
	private Bill bill;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String userLocation, String userSubsidies, Tariff tariff, Bill bill) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
		this.userSubsidies = userSubsidies;
		this.tariff = tariff;
		this.bill = bill;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int i) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public String getUserSubsidies() {
		return userSubsidies;
	}

	public void setUserSubsidies(String userSubsidies) {
		this.userSubsidies = userSubsidies;
	}

	public Tariff getTariff() {
		return tariff;
	}

	public void setTariff(Tariff tariff) {
		this.tariff = tariff;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
	
	
	
	

}
