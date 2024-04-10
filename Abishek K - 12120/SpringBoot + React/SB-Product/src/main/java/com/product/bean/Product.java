package com.product.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String pName;
	private float pPrice;
	private String pLife;
	private String pRews;
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int pId, String pName, float pPrice, String pLife, String pRews) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pLife = pLife;
		this.pRews = pRews;
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


	public float getpPrice() {
		return pPrice;
	}


	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}


	public String getpLife() {
		return pLife;
	}


	public void setpLife(String pLife) {
		this.pLife = pLife;
	}


	public String getpRews() {
		return pRews;
	}


	public void setpRews(String pRews) {
		this.pRews = pRews;
	}
	
	


	


	

	
	
	
	

}
