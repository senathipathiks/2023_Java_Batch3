package com.ems.bean;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dptId;
	private String dptName;
	
	@OneToMany(mappedBy = "dprt")
	private List<Employee> eList = new ArrayList<Employee>();
 	
	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Department(int dptId, String dptName, List<Employee> eList) {
		super();
		this.dptId = dptId;
		this.dptName = dptName;
		this.eList = eList;
	}



	public int getDptId() {
		return dptId;
	}



	public void setDptId(int dptId) {
		this.dptId = dptId;
	}



	public String getDptName() {
		return dptName;
	}



	public void setDptName(String dptName) {
		this.dptName = dptName;
	}



	


	

	
	
 	
    

}
