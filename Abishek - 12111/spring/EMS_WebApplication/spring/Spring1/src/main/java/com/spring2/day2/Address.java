package com.spring2.day2;

public class Address {
	private int doorno;
	private String street;
	private String city;
	
	public Address()
	{
		super();
	}

	public Address(int doorno, String street, String city) {
		super();
		this.doorno = doorno;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", city=" + city + "]";
	}

	public int getDoorno() {
		return doorno;
	}

	public void setDoorno(int doorno) {
		this.doorno = doorno;
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
	
}

