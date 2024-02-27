package com.day4.bean;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	private List<Books> book;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, List<Books> book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
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

	public List<Books> getBook() {
		return book;
	}

	public void setBook(List<Books> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", book=" + book + "]";
	}

}
