package com.ticket.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passengerId;
	private int noOfSeats;
	private String pickupLoc;
	private String dropLoc;
	private double amountPaid;
	
	@ManyToOne(targetEntity =Bus.class, cascade=CascadeType.MERGE)
	private Bus bus;
	
	public Passenger() {
		super();
	}

	

	public Passenger(int passengerId, int noOfSeats, String pickupLoc, String dropLoc, double amountPaid, Bus bus) {
		super();
		this.passengerId = passengerId;
		this.noOfSeats = noOfSeats;
		this.pickupLoc = pickupLoc;
		this.dropLoc = dropLoc;
		this.amountPaid = amountPaid;
		this.bus = bus;
	}



	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getPickupLoc() {
		return pickupLoc;
	}

	public void setPickupLoc(String pickupLoc) {
		this.pickupLoc = pickupLoc;
	}

	public String getDropLoc() {
		return dropLoc;
	}

	public void setDropLoc(String dropLoc) {
		this.dropLoc = dropLoc;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", noOfSeats=" + noOfSeats + ", pickupLoc=" + pickupLoc
				+ ", dropLoc=" + dropLoc + ", amountPaid=" + amountPaid + ", bus=" + bus + "]";
	}
	
	
	
	
	
	

}
