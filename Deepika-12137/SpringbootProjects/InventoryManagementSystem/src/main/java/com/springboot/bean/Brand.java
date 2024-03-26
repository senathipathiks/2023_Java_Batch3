package com.springboot.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	
	private String bname;
	private String manufacturer;
	private String productCount;
	private String contact;
	private String address;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Inventory inventory;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(int bid, String bname, String manufacturer, String productCount, String contact, String address) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.manufacturer = manufacturer;
		this.productCount = productCount;
		this.contact = contact;
		this.address = address;
		
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
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

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", bname=" + bname + ", manufacturer=" + manufacturer + ", productCount="
				+ productCount + ", contact=" + contact + ", address=" + address + ", Inventory=" + inventory + "]";
	}
	
	
	
}
