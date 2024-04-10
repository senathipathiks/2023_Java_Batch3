package com.demo1.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private long userPhn;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_Id")
//	@JoinTable(name = "user_mobile", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "mobileId"))
	private List<Mobile> mobile;

	
	public User() {

	}

	public User(int userId, String userName, long userPhn) {
		this.userId = userId;
		this.userName = userName;
		this.userPhn = userPhn;
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

	public long getUserPhn() {
		return userPhn;
	}

	public void setUserPhn(long userPhn) {
		this.userPhn = userPhn;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhn=" + userPhn + ", address=" + address
				+  "]";
	}

}
