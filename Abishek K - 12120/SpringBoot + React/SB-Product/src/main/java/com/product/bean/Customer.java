package com.product.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_Customer")
public class Customer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	private int cId;
	private String cName;
	private String cAge;
	private String cMob;
	private String cLocation;
	private String cTxns;
	
	@ManyToOne(targetEntity = Product.class, cascade = CascadeType.DETACH)
	@JoinColumn(name="pId")
	private Product prd;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cId, String cName, String cAge, String cMob, String cLocation, String cTxns, Product prd) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cAge = cAge;
		this.cMob = cMob;
		this.cLocation = cLocation;
		this.cTxns = cTxns;
		this.prd = prd;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAge() {
		return cAge;
	}

	public void setcAge(String cAge) {
		this.cAge = cAge;
	}

	public String getcMob() {
		return cMob;
	}

	public void setcMob(String cMob) {
		this.cMob = cMob;
	}

	public String getcLocation() {
		return cLocation;
	}

	public void setcLocation(String cLocation) {
		this.cLocation = cLocation;
	}

	public String getcTxns() {
		return cTxns;
	}

	public void setcTxns(String cTxns) {
		this.cTxns = cTxns;
	}

	public Product getPrd() {
		return prd;
	}

	public void setPrd(Product prd) {
		this.prd = prd;
	}
	
	

}


