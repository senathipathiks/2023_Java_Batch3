package com.tms.repository;

import java.util.List;
import com.tms.bean.Booking;

public interface BookingDao {

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

	public boolean deleteBooking(int bookingId);

	public boolean updatePayment(int bookingId);

	public Booking updateBook(Booking book);

	public boolean updatemailBooking(int bookingId);

	List<Booking> getAllBookingDetails();

	public boolean updateEmailRejected(int bookingId);

	public Object getPaymentCount();

	public List<Booking> getPaymentBookings();
}
