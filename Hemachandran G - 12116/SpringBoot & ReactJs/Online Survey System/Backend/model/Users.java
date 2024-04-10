package com.oss.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usersId;
	private String usersName;
	private String usersMobNo;
	private String usersAddress;
	private String usersDOB;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "adminId")
	private Administration admin;

	public Users(int usersId, String usersName, String usersMobNo, String usersAddress, String usersDOB,
			Administration admin) {
		super();
		this.usersId = usersId;
		this.usersName = usersName;
		this.usersMobNo = usersMobNo;
		this.usersAddress = usersAddress;
		this.usersDOB = usersDOB;
		this.admin = admin;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUsersId() {
		return usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getUsersMobNo() {
		return usersMobNo;
	}

	public void setUsersMobNo(String usersMobNo) {
		this.usersMobNo = usersMobNo;
	}

	public String getUsersAddress() {
		return usersAddress;
	}

	public void setUsersAddress(String usersAddress) {
		this.usersAddress = usersAddress;
	}

	public String getUsersDOB() {
		return usersDOB;
	}

	public void setUsersDOB(String usersDOB) {
		this.usersDOB = usersDOB;
	}

	public Administration getAdmin() {
		return admin;
	}

	public void setAdmin(Administration admin) {
		this.admin = admin;
	}
	
	
}
