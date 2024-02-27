package com.hql.MyHQLProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
		{
			@NamedQuery(
					name = "findDoctorById",
					query = "from Doctor d where dId=:id"
					),

			@NamedQuery(
					name = "findDoctorByName",
					query = "from Doctor d where dName= :name"
					),

			@NamedQuery(
					name = "findDoctorBydept",
					query = "from Doctor d where dept > :dp"
					),
		}
		)


@Entity
@Table(name="Doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dId;
	private String dName;
	private int dept;

	public Doctor() {
		super();
	}

	public Doctor(int dId, String dName, int dept) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dept = dept;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Doctor [dId=" + dId + ", dName=" + dName + ", dept=" + dept + "]";
	}

}
