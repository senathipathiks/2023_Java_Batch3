package com.tms.repository;

import java.util.List;
import com.tms.bean.Booking;

public interface BookingDao {

	public Booking insertBooking(Booking newBooking);

	public List<Booking> getPendingBookings();

	public List<Booking> getApprovedBookings();
	
	public List<Booking> getRejectedBookings();

	public Booking userfindBook(int userId);
	
	public Booking appfind(int bookingId);

	public List<Integer> getBookingId();

	public Object getApprovedCount();

	public Object getRejectedCount();

	public Object getPendingCount();

	public boolean updateApprovedBooking(int bookingId);
	
	public boolean updateRejectedBooking(int bookingId);
}
