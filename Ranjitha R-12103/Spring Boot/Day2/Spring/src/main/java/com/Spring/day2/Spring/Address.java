package com.Spring.day2.Spring;

public class Address {
	private int doorNo;
	private String Street;
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int doorNo, String street, String city) {
		super();
		this.doorNo = doorNo;
		Street = street;
		this.city = city;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", Street=" + Street + ", city=" + city + "]";
	}

}
