package com.crimemgt.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Complaint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int complaintId;

	private String complaintType;
	private String priority;
	private String description;
	private LocalDateTime incidentTime;
	private String status;

	@ManyToOne(targetEntity = User.class, cascade = CascadeType.MERGE)
	@JoinColumn(name = "userId")
	private User user;

	@ManyToOne(targetEntity = Station.class, cascade = CascadeType.MERGE)
	@JoinColumn(name = "stationId")
	private Station station;

	public Complaint() {
		super();
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public String getpriority() {
		return priority;
	}

	public void setpriority(String priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getIncidentTime() {
		return incidentTime;
	}

	public void setIncidentTime(LocalDateTime incidentTime) {
		this.incidentTime = incidentTime;
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

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", complaintType=" + complaintType + ", priority=" + priority
				+ ", description=" + description + ", incidentTime=" + incidentTime + ", status=" + status + ", user="
				+ user + ", station=" + station + "]";
	}

}
