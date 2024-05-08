package com.bms.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Payee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payeeId;
	private String payeeName;
	private String nickName;
	private long accountNumber;
	private double balanceAmount;

	@OneToMany(mappedBy = "payee")
	private List<Transaction> transaction;
	
	public Payee() {

	}

	public Payee(int payeeId, String payeeName, String nickName, long accountNumber, double balanceAmount) {
		super();
		this.payeeId = payeeId;
		this.payeeName = payeeName;
		this.nickName = nickName;
		this.accountNumber = accountNumber;
		this.balanceAmount = balanceAmount;
	}

	public int getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(int payeeId) {
		this.payeeId = payeeId;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

}
