package com.tms.bean;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin_tbl")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	private String adminName;
	private String adminPassword;
	private String adminMobile;
	private String adminEmail;
	private String adminAddress;

	@OneToMany(targetEntity = PackageDetails.class, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "admin_id")
	private Set<PackageDetails> packageDetails;

	@OneToMany(targetEntity = Booking.class, cascade = CascadeType.MERGE)
	@JoinColumn(name = "admin_id")
	private Set<Booking> booking;

	public Admin() {
		super();
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminMobile() {
		return adminMobile;
	}

	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

	public Set<PackageDetails> getPackageDetails() {
		return packageDetails;
	}

	public void setPackageDetails(Set<PackageDetails> packageDetails) {
		this.packageDetails = packageDetails;
	}

	public Set<Booking> getBooking() {
		return booking;
	}

	public void setBooking(Set<Booking> booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", adminMobile=" + adminMobile + ", adminEmail=" + adminEmail + ", adminAddress=" + adminAddress
				+ ", packageDetails=" + packageDetails + ", booking=" + booking + "]";
	}

}
