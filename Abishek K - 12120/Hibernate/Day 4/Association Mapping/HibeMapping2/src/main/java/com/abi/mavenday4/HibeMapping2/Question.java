package com.abi.mavenday4.HibeMapping2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	private String qname;
	
	@OneToMany(targetEntity = Answer.class, cascade = CascadeType.ALL)
	@JoinColumn(name="QID")
	private List<Answer> list = new ArrayList<Answer>();

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int qid, String qname, List<Answer> list) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.list = list;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getList() {
		return list;
	}

	public void setList(List<Answer> list) {
		this.list = list;
	}
	
	
	
	
	

}
