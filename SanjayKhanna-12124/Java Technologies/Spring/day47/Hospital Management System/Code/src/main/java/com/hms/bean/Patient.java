package com.hms.bean;

import javax.persistence.*;

@Entity
@Table
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	private int patientAge;
	private String disease;
	public Patient() {
		super();
	}
	
	public Patient(String patientName, int patientAge, String disease) {
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.disease = disease;
	}

	public Patient(int patientId, String patientName, int patientAge, String disease) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.disease = disease;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
}
