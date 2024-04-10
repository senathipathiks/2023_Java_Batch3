package com.bms.bean;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@SequenceGenerator(name = "values", sequenceName = "value",  initialValue = 14596)
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "values")
	private int accountNumber;
	private String userName;
	private String eMail;
	private String contact;
	private String address;
	private String branchName;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Transaction> transaction;
	
	public User() {
		super();
	}

	public User(int accountNumber, String userName, String eMail, String contact, String address, String branchName) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.eMail = eMail;
		this.contact = contact;
		this.address = address;
		this.branchName = branchName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
}
