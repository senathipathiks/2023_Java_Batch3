package com.pet.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Petition")
public class Petition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int petid;
	@Column(name="category")
	private String category;
	@Column(name="description")
	private String description;
	@Column(name="prirority")
	private String priority;
	@Column(name="raisedby")
	private String raisedby;
	@Column(name="assignedto")
	private String assignedto;
	@Column(name="status")
	private String status;
	
	public Petition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Petition(int petid, String category, String description, String priority, String raisedby, String assignedto,
			String status) {
		super();
		this.petid = petid;
		this.category = category;
		this.description = description;
		this.priority = priority;
		this.raisedby = raisedby;
		this.assignedto = assignedto;
		this.status = status;
	}

	public int getPetid() {
		return petid;
	}

	public void setPetid(int petid) {
		this.petid = petid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getRaisedby() {
		return raisedby;
	}

	public void setRaisedby(String raisedby) {
		this.raisedby = raisedby;
	}

	public String getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

	
	
	
	

	
	

}
