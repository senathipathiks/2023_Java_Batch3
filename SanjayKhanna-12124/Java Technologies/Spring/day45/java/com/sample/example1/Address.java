package com.sample.example1;

public class Address {
	
	private int doorNumber;
	private String street;
	private String city;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int doorNumber, String street, String city) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.city = city;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", street=" + street + ", city=" + city + "]";
	}
	
	

}
