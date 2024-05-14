package com.sbmobilerepairapp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	private String pModel;
	private String rDescription;
	@OneToMany(cascade = CascadeType.REMOVE)
	private List<User> users;
	
	@OneToMany(cascade = CascadeType.REMOVE)
	private List<Shops> shops;
	
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getpModel() {
		return pModel;
	}
	public void setpModel(String pModel) {
		this.pModel = pModel;
	}
	public String getrDescription() {
		return rDescription;
	}
	public void setrDescription(String rDescription) {
		this.rDescription = rDescription;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Shops> getShops() {
		return shops;
	}
	public void setShops(List<Shops> shops) {
		this.shops = shops;
	}
	
	

}
