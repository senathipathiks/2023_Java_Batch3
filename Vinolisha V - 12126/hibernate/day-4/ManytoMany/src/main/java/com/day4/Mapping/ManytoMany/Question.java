package com.day4.Mapping.ManytoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

@Table(name="Question")

public class Question {
	@Id
	private int Qid;
	private String Qname;
	
	@ManyToMany(targetEntity = Answer.class, cascade= CascadeType.ALL)
	List<Answer> answer= new ArrayList<>();

	public Question() {
		super();
		
	}

	public Question(int qid, String qname, List<Answer> answer) {
		super();
		Qid = qid;
		Qname = qname;
		this.answer = answer;
	}

	public int getQid() {
		return Qid;
	}

	public void setQid(int qid) {
		Qid = qid;
	}

	public String getQname() {
		return Qname;
	}

	public void setQname(String qname) {
		Qname = qname;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	
	
	
	
	
	
	
	

}
