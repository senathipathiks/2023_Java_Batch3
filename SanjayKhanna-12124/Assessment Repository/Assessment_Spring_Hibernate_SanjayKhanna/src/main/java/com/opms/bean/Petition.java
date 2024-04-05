package com.opms.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Petition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petitionId;
	private String category;
	private String description; 
	private String priority;
	private String raisedBy;
	private String assignedTo;
	private String status;
	
	public Petition() {
		super();
		
	}

	public Petition(int petitionId, String category, String desc, String priority, String raisedBy, String assignedTo,
			String status) {
		this.petitionId = petitionId;
		this.category = category;
		this.description = desc;
		this.priority = priority;
		this.raisedBy = raisedBy;
		this.assignedTo = assignedTo;
		this.status = status;
	}

	public int getPetitionId() {
		return petitionId;
	}

	public void setPetitionId(int petitionId) {
		this.petitionId = petitionId;
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

	public String getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
