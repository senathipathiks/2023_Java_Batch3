package com.abi.mavenday2.Project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int custid;
	@Column(name="Custname")
	private String custname;
	@Column(name="CustPHNO")
	private String custphno;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custid, String custname, String custphno) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custphno = custphno;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustphno() {
		return custphno;
	}
	public void setCustphno(String custphno) {
		this.custphno = custphno;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custphno=" + custphno + "]";
	}
	
	

}
