package com.abi.mavenday5.AssociationMapProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserDetails {
	
	@Id
	private int Uid;
	private String Uname;
	
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	private Address adrs;
    
	@ManyToMany(targetEntity = Vehicle.class, cascade = CascadeType.ALL)
	List<Vehicle> vlist = new ArrayList();

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(int uid, String uname, Address adrs, List<Vehicle> vlist) {
		super();
		Uid = uid;
		Uname = uname;
		this.adrs = adrs;
		this.vlist = vlist;
	}

	public int getUid() {
		return Uid;
	}

	public void setUid(int uid) {
		Uid = uid;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	public List<Vehicle> getVlist() {
		return vlist;
	}

	public void setVlist(List<Vehicle> vlist) {
		this.vlist = vlist;
	}
	
	
	
	
	

}
