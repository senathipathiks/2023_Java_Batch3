package com.hibernate.day4.AssociationManytoMany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	private int eroll;
	private String name;

	@ManyToMany(targetEntity = Project.class, cascade = CascadeType.REFRESH)
	@JoinTable(name = "EmpProject", joinColumns = { @JoinColumn(name = "eid") }, inverseJoinColumns = {
			@JoinColumn(name = "pid") })
	Set<Project> projects = new HashSet<Project>();

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eroll, String name, Set<Project> projects) {
		super();
		this.eroll = eroll;
		this.name = name;
		this.projects = projects;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public int getEroll() {
		return eroll;
	}

	public void setEroll(int eroll) {
		this.eroll = eroll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", name=" + name + "]";
	}

}
