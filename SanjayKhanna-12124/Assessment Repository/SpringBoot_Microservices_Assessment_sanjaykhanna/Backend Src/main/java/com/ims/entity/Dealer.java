package com.ims.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Dealer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealerId;
	private String dealerName;
	private String dealerAddress;
	private long dealerContactNo;
	
	@ManyToOne
	private Product product;

	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dealer(int dealerId, String dealerName, String dealerAddress, long dealerContactNo, Product product) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.dealerAddress = dealerAddress;
		this.dealerContactNo = dealerContactNo;
		this.product = product;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerAddress() {
		return dealerAddress;
	}

	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}

	public long getDealerContactNo() {
		return dealerContactNo;
	}

	public void setDealerContactNo(long dealerContactNo) {
		this.dealerContactNo = dealerContactNo;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}	

}
