package com.rms.bean;

public class Restaurant {

	int rest_id;
	String rest_name;
	String rest_type;
	String address;
	String phno;
	String email;
	Float rate;
	String prop;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(int rest_id, String rest_name, String rest_type, String address, String phno, String email,
			Float rate, String prop) {
		super();
		this.rest_id = rest_id;
		this.rest_name = rest_name;
		this.rest_type = rest_type;
		this.address = address;
		this.phno = phno;
		this.email = email;
		this.rate = rate;
		this.prop = prop;
	}

	public int getRest_id() {
		return rest_id;
	}

	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}

	public String getRest_name() {
		return rest_name;
	}

	public void setRest_name(String rest_name) {
		this.rest_name = rest_name;
	}

	public String getRest_type() {
		return rest_type;
	}

	public void setRest_type(String rest_type) {
		this.rest_type = rest_type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

}
