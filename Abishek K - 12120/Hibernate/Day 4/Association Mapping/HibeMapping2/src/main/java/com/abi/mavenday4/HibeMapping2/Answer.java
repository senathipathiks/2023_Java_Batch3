package com.abi.mavenday4.HibeMapping2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Answer")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Aid;
	private String ans;
	private String postby;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int aid, String ans, String postby) {
		super();
		Aid = aid;
		this.ans = ans;
		this.postby = postby;
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public String getPostby() {
		return postby;
	}

	public void setPostby(String postby) {
		this.postby = postby;
	}
	
	
	
	
	
	
	
	
	

}
