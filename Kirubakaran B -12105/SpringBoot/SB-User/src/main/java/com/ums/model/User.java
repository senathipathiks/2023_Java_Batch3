package com.ums.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private int userSal;
	private int userAge;
	private String userAddress;
	
	@ManyToOne(targetEntity = Dept.class, cascade = CascadeType.REFRESH)
	@JoinColumn(name="dept_deptid")
	private Dept dept;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, int userSal, int userAge, String userAddress, Dept dept) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSal = userSal;
		this.userAge = userAge;
		this.userAddress = userAddress;
		this.dept = dept;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserSal() {
		return userSal;
	}

	public void setUserSal(int userSal) {
		this.userSal = userSal;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
	
	
}
