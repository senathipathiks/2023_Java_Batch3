package com.tms.service;

import java.util.List;

import com.tms.bean.Booking;

public interface BookingService {

	public Booking insertBooking(Booking newBooking);

	public List<Booking> getPendingBookings();

	public List<Booking> getApprovedBookings();

	public List<Booking> getRejectedBookings();

	public List<String> userfindBook(int userId);

	public Booking appfind(int bookingId);

	public List<Integer> getBookingId();

	public Object getApprovedCount();

	public Object getRejectedCount();

	public Object getPendingCount();

	public boolean updateApprovedBooking(int bookingId);

	public boolean updateRejectedBooking(int bookingId);

	public List<Booking> findBookingbyId(int userId);

	public boolean updatePayment(int bookingId);

	public Booking updateBook(Booking book);

	public List<Booking> getAllBookingDetails();

	public boolean deleteBooking(int bookingId);

	public Object getPaymentCount();
	
	public List<Booking> getPaymentBookings();


}
