package com.abi.mavenday5.AssociationMapProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle")
public class Vehicle {
	
	@Id
	private int Vid;
	private String Vname;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vid, String vname) {
		super();
		Vid = vid;
		Vname = vname;
	}

	public int getVid() {
		return Vid;
	}

	public void setVid(int vid) {
		Vid = vid;
	}

	public String getVname() {
		return Vname;
	}

	public void setVname(String vname) {
		Vname = vname;
	}
	
	

	
	
	

}
