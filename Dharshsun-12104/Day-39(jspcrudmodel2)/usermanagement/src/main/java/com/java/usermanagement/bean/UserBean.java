package com.java.usermanagement.bean;

public class UserBean {

	protected int id;
    protected String name;
    protected String email;
    protected String country;

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBean(String name, String email, String country) {
        super();
        this.name = name;
        this.email = email;
        this.country = country;
    }


	public UserBean(int id, String name, String email, String country) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", email=" + email + ", country=" + country + "]";
	}
}





