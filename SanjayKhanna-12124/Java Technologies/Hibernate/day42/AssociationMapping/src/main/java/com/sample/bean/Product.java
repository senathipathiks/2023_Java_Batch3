package com.sample.bean;

import java.util.List;
import javax.persistence.*;

@Entity
@Table
public class Product {
	
	@Id
	private int productId;
	private String productName;
	

	public Product() {
		
	}

	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Customer> getLis() {
		return lis;
	}

	public void setLis(List<Customer> lis) {
		this.lis = lis;
	}
	
	
}
