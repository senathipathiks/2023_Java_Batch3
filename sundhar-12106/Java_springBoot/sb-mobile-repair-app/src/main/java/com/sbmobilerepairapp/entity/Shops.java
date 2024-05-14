package com.sbmobilerepairapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Shops {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sId;
	private String sName;
	private String sLocation;
	private String sOpertingHours;
	private long sContact;
	private double sRating;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsLocation() {
		return sLocation;
	}

	public void setsLocation(String sLocation) {
		this.sLocation = sLocation;
	}

	public String getsOpertingHours() {
		return sOpertingHours;
	}

	public void setsOpertingHours(String sOpertingHours) {
		this.sOpertingHours = sOpertingHours;
	}

	public long getsContact() {
		return sContact;
	}

	public void setsContact(long sContact) {
		this.sContact = sContact;
	}

	public double getsRating() {
		return sRating;
	}

	public void setsRating(double sRating) {
		this.sRating = sRating;
	}

}
