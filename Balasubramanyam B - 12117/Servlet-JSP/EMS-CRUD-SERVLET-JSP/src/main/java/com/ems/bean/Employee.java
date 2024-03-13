package com.ems.bean;

public class Employee {
	private int Id;
	private String Name;
	private int Age;
	public Employee(int Id, String Name, int Age) {
		super();
		this.Id = Id;
		this.Name = Name;
		this.Age = Age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}}