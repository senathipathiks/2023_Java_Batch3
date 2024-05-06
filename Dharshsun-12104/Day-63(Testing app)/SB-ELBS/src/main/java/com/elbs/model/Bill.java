package com.elbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BillTable")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billId;
	private int unitAmount;
	private int billAmount;
	private String billPaidStatus;
	
	public Bill() {
		super();
	}
	public Bill(int billId, int unitAmount, int billAmount, String billPaidStatus) {
		super();
		this.billId = billId;
		this.unitAmount = unitAmount;
		this.billAmount = billAmount;
		this.billPaidStatus = billPaidStatus;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getUnitAmount() {
		return unitAmount;
	}
	public void setUnitAmount(int unitAmount) {
		this.unitAmount = unitAmount;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillPaidStatus() {
		return billPaidStatus;
	}
	public void setBillPaidStatus(String billPaidStatus) {
		this.billPaidStatus = billPaidStatus;
	}
	
	
}
