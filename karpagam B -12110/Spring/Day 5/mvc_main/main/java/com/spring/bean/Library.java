package com.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LibraryTbl")
public class Library {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bid;
	private String bname;
	private String buath;
	
	public Library() {
		super();
	}

	public Library(int bid, String bname, String buath) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.buath = buath;
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

	public String getBuath() {
		return buath;
	}

	public void setBuath(String buath) {
		this.buath = buath;
	}

	@Override
	public String toString() {
		return "Library [bid=" + bid + ", bname=" + bname + ", buath=" + buath + "]";
	}
}
