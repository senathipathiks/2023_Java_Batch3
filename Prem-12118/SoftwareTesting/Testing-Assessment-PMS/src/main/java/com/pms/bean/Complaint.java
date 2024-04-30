package com.pms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Complaint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="complaintId", nullable=false, length=512)
	private Long complaintId; 

	private String description;
	private String status;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	
	public Long getComplaintId() {
		return complaintId;
	}

	public void setComplaintID(Long complaintID) {
		this.complaintId = complaintID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}