package com.bms.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;


@Entity
@SequenceGenerator(name = "tid", sequenceName = "tid",  initialValue = 15632)
@Table
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "tid")
	private int transactionId;
	private String modeOfTransaction;
	private String transactionLocation;
	
	@ManyToOne
	@JoinColumn(name="accountNumber")
	private User user;

	public Transaction() {
		super();
	}

	public Transaction(int transactionId, String modeOfTransaction, String transactionLocation) {
		super();
		this.transactionId = transactionId;
		this.modeOfTransaction = modeOfTransaction;
		this.transactionLocation = transactionLocation;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getModeOfTransaction() {
		return modeOfTransaction;
	}

	public void setModeOfTransaction(String modeOfTransaction) {
		this.modeOfTransaction = modeOfTransaction;
	}

	public String getTransactionLocation() {
		return transactionLocation;
	}

	public void setTransactionLocation(String transactionLocation) {
		this.transactionLocation = transactionLocation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
