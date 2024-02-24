package com.hotel.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="rmtype")
	private String rmtype;
	@Column(name="rmtariff")
	private String rmtariff;
	@Column(name="rmdesc")
	private String rmdesc;
	@Column(name="rmoccup")
	private String rmoccup;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(int id, String rmtype, String rmtariff, String rmdesc, String rmoccup) {
		super();
		this.id = id;
		this.rmtype = rmtype;
		this.rmtariff = rmtariff;
		this.rmdesc = rmdesc;
		this.rmoccup = rmoccup;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRmtype() {
		return rmtype;
	}
	public void setRmtype(String rmtype) {
		this.rmtype = rmtype;
	}
	public String getRmtariff() {
		return rmtariff;
	}
	public void setRmtariff(String rmtariff) {
		this.rmtariff = rmtariff;
	}
	public String getRmdesc() {
		return rmdesc;
	}
	public void setRmdesc(String rmdesc) {
		this.rmdesc = rmdesc;
	}
	public String getRmoccup() {
		return rmoccup;
	}
	public void setRmoccup(String rmoccup) {
		this.rmoccup = rmoccup;
	}
	
	

}
