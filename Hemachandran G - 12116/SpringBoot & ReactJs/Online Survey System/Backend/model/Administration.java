package com.oss.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Administration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	private String adminName;
	private String adminPhnNo;
	private String adminAddress;
	public Administration(int adminId, String adminName, String adminPhnNo, String adminAddress) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPhnNo = adminPhnNo;
		this.adminAddress = adminAddress;
	}
	public Administration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPhnNo() {
		return adminPhnNo;
	}
	public void setAdminPhnNo(String adminPhnNo) {
		this.adminPhnNo = adminPhnNo;
	}
	public String getAdminAddress() {
		return adminAddress;
	}
	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}
	
	

}
