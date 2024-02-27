package com.day5.IntroHibernateMap;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "DepartOneToMany")
public class Department2 {

	@Id
	private int deptid;
	private String deptname;

	

	public Department2() {

		// TODO Auto-generated constructor stub

	}

	public Department2(int deptid, String deptname) {

		super();

		this.deptid = deptid;

		this.deptname = deptname;

	

	}

	public int getdeptid() {

		return deptid;

	}

	public void setdeptid(int deptid) {

		this.deptid = deptid;

	}

	public String getdeptname() {

		return deptname;

	}

	public void setdeptname(String deptname) {

		this.deptname = deptname;

	}





}
