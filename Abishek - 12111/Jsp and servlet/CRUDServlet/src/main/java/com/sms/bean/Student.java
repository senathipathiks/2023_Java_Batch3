package com.sms.bean;

public class Student 
{
	private int id;
	private String name;
	private String city;
	
	
	public Student()
	{
		super();
	}
	public Student ( int id, String name, String city)
	{
		super();
		this.id=id;
		this.name=name;
				this.city=city;
	}
	public int getId()
	{
		return id;
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
	public void setId(int id) {
		this.id = id;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}