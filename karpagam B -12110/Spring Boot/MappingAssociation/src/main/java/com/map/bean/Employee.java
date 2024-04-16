package com.map.bean;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String empName;
	
	@ManyToOne
    @JoinColumn(name = "org_id")
	private Organization org;
	
	@OneToOne
	@JoinColumn(name = "parking_spot_id")
    private ParkingSpot parkingSpot;
	
	 @ManyToMany
	 @JoinTable(name = "Employee_Project",
	            joinColumns = @JoinColumn(name = "employee_id"),
	            inverseJoinColumns = @JoinColumn(name = "project_id"))
	 private List<Project> project;
	 
	 public Employee() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Organization getOrg() {
		return org;
	}


	public void setOrg(Organization org) {
		this.org = org;
	}


	 
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}


	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", org=" + org + ", parkingSpot=" + parkingSpot + "]";
	}
	
	

	
	
	
	

}
