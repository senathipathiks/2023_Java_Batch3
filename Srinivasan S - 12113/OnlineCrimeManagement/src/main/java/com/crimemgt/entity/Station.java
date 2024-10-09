package com.crimemgt.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table
public class Station {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stationId;

	private String stationName;
	private String stationLoc;
	private String stationCity;
	private long stationPhn;
	private String stationPassword;

	@ManyToOne(targetEntity = Admin.class, cascade = CascadeType.ALL)
	private Admin admin;

	

	public Station() {
		super();
	}

	public Station(int stationId, String stationName, String stationLoc, String stationCity, long stationPhn,
			String stationPassword, Admin admin) {
		super();
		this.stationId = stationId;
		this.stationName = stationName;
		this.stationLoc = stationLoc;
		this.stationCity = stationCity;
		this.stationPhn = stationPhn;
		this.stationPassword = stationPassword;
		this.admin = admin;

		
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationLoc() {
		return stationLoc;
	}

	public void setStationLoc(String stationLoc) {
		this.stationLoc = stationLoc;
	}

	public String getStationCity() {
		return stationCity;
	}

	public void setStationCity(String stationCity) {
		this.stationCity = stationCity;
	}

	public long getStationPhn() {
		return stationPhn;
	}

	public void setStationPhn(long stationPhn) {
		this.stationPhn = stationPhn;
	}

	public String getStationPassword() {
		return stationPassword;
	}

	public void setStationPassword(String stationPassword) {
		this.stationPassword = stationPassword;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	
	@Override
	public String toString() {
		return "Station [stationId=" + stationId + ", stationName=" + stationName + ", stationLoc=" + stationLoc
				+ ", stationCity=" + stationCity + ", stationPhn=" + stationPhn + ", stationPassword=" + stationPassword
				+ ", admin=" + admin + "]";
	}

}
