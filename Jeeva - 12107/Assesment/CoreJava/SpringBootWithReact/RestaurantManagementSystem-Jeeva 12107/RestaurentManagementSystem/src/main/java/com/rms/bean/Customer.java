package com.rms.bean;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {

	@Id	
	private int cid;	
	private String cname;
	private String caddress;
	private int cage;
	private String cdob;
	private String cphone;
	
	@ManyToOne
	@JoinColumn(name ="rid")
	private Restaurant res;
	
	

	public Customer() {
		super();
	}

	public Customer(int cid, String cname, String caddress, int cage, String cdob, String cphone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
		this.cage = cage;
		this.cdob = cdob;
		this.cphone = cphone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public int getCage() {
		return cage;
	}

	public void setCage(int cage) {
		this.cage = cage;
	}

	public String getCdob() {
		return cdob;
	}

	public void setCdob(String cdob) {
		this.cdob = cdob;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public Restaurant getRes() {
		return res;
	}

	public void setRes(Restaurant res) {
		this.res = res;
	}	
	
	
	
	
	
	
}
