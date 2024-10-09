package com.crimemgt.dto;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;

public class UserDTO {

	private int userId;

	private String userName;
	private String userAddress;
	private long userPhn;
	private int userAge;
	private String userPassword;
	private String userconfirmPassword;
	private String userProof;
	
	@Lob
	@Column(name = "proofImg", length = 1000000)
	private byte[] proofImg;
	
	public UserDTO() {
		super();
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


	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userPhn="
				+ userPhn + ", userAge=" + userAge + ", userPassword=" + userPassword + ", userconfirmPassword="
				+ userconfirmPassword + ", userProof=" + userProof + ", proofImg=" + Arrays.toString(proofImg) + "]";
	}

	
	
	
}
