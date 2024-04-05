package com.ims.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int customerId;
	private String customerName;
	private long customerContactNo;
	private String paymentMethod;
	
	@ManyToOne
	private Product product;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Customer(int customerId, String customerName, long customerContactNo, String paymentMethod,
			Product product) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContactNo = customerContactNo;
		this.paymentMethod = paymentMethod;
		this.product = product;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	

	public long getCustomerContactNo() {
		return customerContactNo;
	}



	public void setCustomerContactNo(long customerContactNo) {
		this.customerContactNo = customerContactNo;
	}



	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
