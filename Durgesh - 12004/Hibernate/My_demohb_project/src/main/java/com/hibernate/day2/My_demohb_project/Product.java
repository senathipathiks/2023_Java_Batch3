package com.hibernate.day2.My_demohb_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	
	@Column(name = "ProductName")
	private String pName;
	
	@Column(name = "ProductPattern")
	private String pPattern;
	
	@Column(name = "ProductPrice")
	private int price;

	public Product() {
		
	}

	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpPattern() {
		return pPattern;
	}

	public void setpPattern(String pPattern) {
		this.pPattern = pPattern;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPattern=" + pPattern + ", price=" + price + "]";
	}
	
	
	
	

}
