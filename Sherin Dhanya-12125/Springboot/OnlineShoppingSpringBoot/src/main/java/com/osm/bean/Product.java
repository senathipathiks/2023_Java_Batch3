package com.osm.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pdt_id;
	private String pdt_name;
	private String category;
	private int price;
	private String payment_mode;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="cust_id")
	private Customer customer;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pdt_id, String pdt_name, String category, int price, String payment_mode, Customer customer) {
		super();
		this.pdt_id = pdt_id;
		this.pdt_name = pdt_name;
		this.category = category;
		this.price = price;
		this.payment_mode = payment_mode;
		this.customer = customer;
	}

	public int getPdt_id() {
		return pdt_id;
	}

	public void setPdt_id(int pdt_id) {
		this.pdt_id = pdt_id;
	}

	public String getPdt_name() {
		return pdt_name;
	}

	public void setPdt_name(String pdt_name) {
		this.pdt_name = pdt_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
