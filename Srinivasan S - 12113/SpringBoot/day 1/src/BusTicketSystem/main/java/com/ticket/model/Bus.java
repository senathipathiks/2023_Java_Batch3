package com.ticket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bus")
public class Bus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int busId;
	private String busNo;
	private String busName;
	private String busType;
	private int busCapacity;
	
	
	public Bus() {
		super();
	}


	public Bus(int busId, String busNo, String busName, String busType, int busCapacity) {
		super();
		this.busId = busId;
		this.busNo = busNo;
		this.busName = busName;
		this.busType = busType;
		this.busCapacity = busCapacity;
	}


	public int getBusId() {
		return busId;
	}


	public void setBusId(int busId) {
		this.busId = busId;
	}


	public String getBusNo() {
		return busNo;
	}


	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}


	public String getBusName() {
		return busName;
	}


	public void setBusName(String busName) {
		this.busName = busName;
	}


	public String getBusType() {
		return busType;
	}


	public void setBusType(String busType) {
		this.busType = busType;
	}


	public int getBusCapacity() {
		return busCapacity;
	}


	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}


	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busNo=" + busNo + ", busName=" + busName + ", busType=" + busType
				+ ", busCapacity=" + busCapacity + "]";
	}

	
	
	
	
}
