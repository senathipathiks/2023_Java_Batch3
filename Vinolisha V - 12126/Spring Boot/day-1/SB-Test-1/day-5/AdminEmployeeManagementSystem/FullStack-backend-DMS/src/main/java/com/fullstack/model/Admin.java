package com.fullstack.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="admin_tbl")
public class Admin {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String subject;
	private String question;
	private String time;
	
	@JsonManagedReference
	@JsonBackReference
	 @JsonIgnore
	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL,fetch=FetchType.LAZY) //mapedBy to the field name in the Employee entity
	private List<Student> student;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String name, String subject, String question, String time, List<Student> student) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.question = question;
		this.time = time;
		this.student = student;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String username) {
		this.subject = username;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", subject=" + subject + ", question=" + question + ", time="
				+ time + ", student=" + student + "]";
	}	
	
	
}
