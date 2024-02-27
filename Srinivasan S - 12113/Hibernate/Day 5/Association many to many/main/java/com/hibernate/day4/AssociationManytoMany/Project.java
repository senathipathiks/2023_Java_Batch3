package com.hibernate.day4.AssociationManytoMany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	@Id
	private int pId;
	@Column(name="pName")
	private String pName; 
	 @ManyToMany(mappedBy = "projects", cascade = { CascadeType.REFRESH })
	 private Set<Employee>emp=new HashSet<Employee>();

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Project(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public Project() {
		// TODO Auto-generated constructor stub
	}

}
