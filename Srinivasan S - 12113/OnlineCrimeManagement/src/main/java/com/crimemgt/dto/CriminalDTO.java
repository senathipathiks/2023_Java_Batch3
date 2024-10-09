package com.crimemgt.dto;

public class CriminalDTO {

	private int criminalId;

	private String criminalName;
	private String criminalAddress;
	private String criminalPhn;
	private String criminalAge;
	private String noOfCases;
	private byte[] criminalImage;

	public CriminalDTO() {
		super();
	}

	public CriminalDTO(int criminalId, String criminalName, String criminalAddress, String criminalPhn,
			String criminalAge, String noOfCases, byte[] criminalImage) {
		super();
		this.criminalId = criminalId;
		this.criminalName = criminalName;
		this.criminalAddress = criminalAddress;
		this.criminalPhn = criminalPhn;
		this.criminalAge = criminalAge;
		this.noOfCases = noOfCases;
		this.criminalImage = criminalImage;
	}

	public int getCriminalId() {
		return criminalId;
	}

	public void setCriminalId(int criminalId) {
		this.criminalId = criminalId;
	}

	public String getCriminalName() {
		return criminalName;
	}

	public void setCriminalName(String criminalName) {
		this.criminalName = criminalName;
	}

	public String getCriminalAddress() {
		return criminalAddress;
	}

	public void setCriminalAddress(String criminalAddress) {
		this.criminalAddress = criminalAddress;
	}

	public String getCriminalPhn() {
		return criminalPhn;
	}

	public void setCriminalPhn(String criminalPhn) {
		this.criminalPhn = criminalPhn;
	}

	public String getCriminalAge() {
		return criminalAge;
	}

	public void setCriminalAge(String criminalAge) {
		this.criminalAge = criminalAge;
	}

	public String getNoOfCases() {
		return noOfCases;
	}

	public void setNoOfCases(String noOfCases) {
		this.noOfCases = noOfCases;
	}

	public byte[] getCriminalImage() {
		return criminalImage;
	}

	public void setCriminalImage(byte[] criminalImage) {
		this.criminalImage = criminalImage;
	}

}
