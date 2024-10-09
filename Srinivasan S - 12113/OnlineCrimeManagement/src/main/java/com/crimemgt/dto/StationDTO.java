package com.crimemgt.dto;

public class StationDTO {

	private int stationId;

	private String stationName;
	private String stationLoc;
	private String stationCity;
	private long stationPhn;
	private String stationPassword;

	public StationDTO() {
		super();
	}

	public StationDTO(int stationId, String stationName, String stationLoc, String stationCity, long stationPhn,
			String stationPassword) {
		super();
		this.stationId = stationId;
		this.stationName = stationName;
		this.stationLoc = stationLoc;
		this.stationCity = stationCity;
		this.stationPhn = stationPhn;
		this.stationPassword = stationPassword;
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

	
}
