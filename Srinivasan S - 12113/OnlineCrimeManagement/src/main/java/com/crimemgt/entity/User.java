package com.crimemgt.entity;

import java.util.Arrays;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table
@Builder
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String userName;
	private String userAddress;
	private long userPhn;
	private String email;
	private int userAge;
	private String userPassword;
	private String userconfirmPassword;
	private String userProof;

	@Lob
	@Column(name = "proofImg", length = 1000000)
	private byte[] proofImg;

	public User() {
		super();
	}

	public User(int userId, String userName, String userAddress, long userPhn, String email, int userAge,
			String userPassword, String userconfirmPassword, String userProof, byte[] proofImg) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userPhn = userPhn;
		this.email = email;
		this.userAge = userAge;
		this.userPassword = userPassword;
		this.userconfirmPassword = userconfirmPassword;
		this.userProof = userProof;
		this.proofImg = proofImg;
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

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	

	public long getUserPhn() {
		return userPhn;
	}

	public void setUserPhn(long userPhn) {
		this.userPhn = userPhn;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserconfirmPassword() {
		return userconfirmPassword;
	}

	public void setUserconfirmPassword(String userconfirmPassword) {
		this.userconfirmPassword = userconfirmPassword;
	}

	public String getUserProof() {
		return userProof;
	}

	public void setUserProof(String userProof) {
		this.userProof = userProof;
	}

	public byte[] getProofImg() {
		return proofImg;
	}

	public void setProofImg(byte[] proofImg) {
		this.proofImg = proofImg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userPhn="
				+ userPhn + ", email=" + email + ", userAge=" + userAge + ", userPassword=" + userPassword
				+ ", userconfirmPassword=" + userconfirmPassword + ", userProof=" + userProof + ", proofImg="
				+ Arrays.toString(proofImg) + "]";
	}

}
