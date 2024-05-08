package com.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Payee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payeeId;
	@Column(nullable = false)
	private String payeeName;
	@Column(unique = true, nullable = false)
	private String nickName;
	@OneToOne
	private Account account;

	public Payee() {

	}

	public Payee(int payeeId, String payeeName, String nickName, Account account) {
		super();
		this.payeeId = payeeId;
		this.payeeName = payeeName;
		this.nickName = nickName;
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
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

}
