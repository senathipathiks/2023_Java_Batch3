package com.rrs.bean;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_train")
public class Train {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trainId;
	private String trainName;
	private int seatAvailability;
	private String viaDetails;
	private String date;
	
	@OneToMany(mappedBy = "train",cascade = CascadeType.ALL)
	private List<Passenger> passenger;

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int trainId, String trainName, int seatAvailability, String viaDetails, String date) {
		super();
		this.trainId = trainId;
		this.trainName = trainName;
		this.seatAvailability = seatAvailability;
		this.viaDetails = viaDetails;
		this.date = date;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public int getSeatAvailability() {
		return seatAvailability;
	}

	public void setSeatAvailability(int seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

	public String getViaDetails() {
		return viaDetails;
	}

	public void setViaDetails(String viaDetails) {
		this.viaDetails = viaDetails;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
