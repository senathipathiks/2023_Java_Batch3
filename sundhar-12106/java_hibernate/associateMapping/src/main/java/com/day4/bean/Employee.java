package com.day4.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne(cascade = CascadeType.ALL)
	private Deptartment dept;
	@OneToOne(cascade = CascadeType.ALL)
	private Laptop laptop;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Deptartment dept, Laptop laptop) {
		super();
		this.name = name;
		this.dept = dept;
		this.laptop = laptop;
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

	public Deptartment getDept() {
		return dept;
	}

	public void setDept(Deptartment dept) {
		this.dept = dept;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", laptop=" + laptop + "]";
	}

}
