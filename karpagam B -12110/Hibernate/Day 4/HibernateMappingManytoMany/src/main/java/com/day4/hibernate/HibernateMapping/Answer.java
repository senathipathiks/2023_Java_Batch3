package com.day4.hibernate.HibernateMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="answer1")
public class Answer {
	   
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private int id;    
    private String answername;    
    private String postedBy;
    
    public Answer() {
    	super();
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
    
	
    
    
	
	

}
