package com.day4.hibernate.HibernateMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity  
@Table(name="question")  
public class Question {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String qname;
	@ManyToMany(targetEntity = Answer.class, cascade = { CascadeType.ALL })  
	@JoinTable(name = "quesAns1",   
	            joinColumns = { @JoinColumn(name = "q_id") },  
	            inverseJoinColumns = { @JoinColumn(name = "ans_id") })  
	
	

	private List<Answer> answers;
	
	public Question() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}
