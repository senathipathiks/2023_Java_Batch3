package com.day5.ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {

	@Id
	private int deptid;
	private String deptame;

	public Department() {

	}

	public Department(int deptid, String deptame) {
		super();
		this.deptid = deptid;
		this.deptame = deptame;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptame() {
		return deptame;
	}

	public void setDeptame(String deptame) {
		this.deptame = deptame;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptame=" + deptame + "]";
	}

}
