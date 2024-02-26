package com.sample.bean;

import java.util.List;
import javax.persistence.*;

@Entity
@Table
public class Customer {
	
	@Id
	private int customerId;
	private String customerName;
	
	@ManyToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinTable(name = "Product_Customer",joinColumns = {@JoinColumn(name="customerId")},inverseJoinColumns = {@JoinColumn(name="productId")})
	private List<Product> cus;

	public Customer() {
		
	}

	public Customer(int customerId, String customerName, List<Product> cus) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.cus = cus;
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

	public List<Product> getCus() {
		return cus;
	}

	public void setCus(List<Product> cus) {
		this.cus = cus;
	}
	
}