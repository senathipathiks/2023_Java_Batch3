package com.tms.bean;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="booking_tbl")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookingId;
	private String bookingDate;
	private String bookingType;
	private String bookingStatus;
	
	@ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "tour_id")
	private PackageDetails packagedetails ;
	
	

	public Booking() {
		super();
	}

	

	public Booking(int bookingId, String bookingDate, String bookingType, String bookingStatus, User user,
			PackageDetails packagedetails) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.bookingType = bookingType;
		this.bookingStatus = bookingStatus;
		this.user = user;
		this.packagedetails = packagedetails;
	}



	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	public PackageDetails getPackagedetails() {
		return packagedetails;
	}



	public void setPackagedetails(PackageDetails packagedetails) {
		this.packagedetails = packagedetails;
	}



	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", bookingType=" + bookingType
				+ ", bookingStatus=" + bookingStatus + ", user=" + user + "]";
	}
	

	

}
