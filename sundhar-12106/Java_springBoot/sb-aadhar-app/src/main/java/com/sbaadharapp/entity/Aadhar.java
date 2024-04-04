package com.sbaadharapp.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.generator.Generator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Aadhar {

	@Id
//	@SequenceGenerator(name = "custom-id")
	@GenericGenerator(name = "custom-id", type = com.sbaadharapp.customIDGenerator.AadharIdGenerator.class)
	@GeneratedValue(generator = "custom-id", strategy = GenerationType.IDENTITY)
	private String aadharNo;
	private long vidNo;
	private String fName;
	private String address;
	private long phoneNo;

	public Aadhar() {
		// TODO Auto-generated constructor stub
	}

	public Aadhar(String aadharNo, long vidNo, String fName, String address, long phoneNo) {
		super();
		this.aadharNo = aadharNo;
		this.vidNo = vidNo;
		this.fName = fName;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public long getVidNo() {
		return vidNo;
	}

	public void setVidNo(long vidNo) {
		this.vidNo = vidNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Aadhar [aadharNo=" + aadharNo + ", vidNo=" + vidNo + ", fName=" + fName + ", address=" + address
				+ ", phoneNo=" + phoneNo + "]";
	}

}
