package com.sms.bean;

public class StudentClass {

	
		// TODO Auto-generated method stub
    int id;
    String name;
    String city;
    

	public StudentClass() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	

	public StudentClass(int id, String name, String city) {
	
		this.id = id;
		this.name = name;
		this.city = city;
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



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}
	

}
