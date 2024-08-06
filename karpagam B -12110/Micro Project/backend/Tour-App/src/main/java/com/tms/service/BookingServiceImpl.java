package com.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tms.bean.Booking;
import com.tms.repository.BookingDao;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao bookdao;

	@Override
	public Booking insertBooking(Booking newBooking) {
		return bookdao.insertBooking(newBooking);
	}

	@Override
	public List<Booking> getPendingBookings() {
		return bookdao.getPendingBookings();

	}

	@Override
	public List<Booking> getApprovedBookings() {
		return bookdao.getApprovedBookings();
	}

	@Override
	public List<Booking> getRejectedBookings() {
		return bookdao.getRejectedBookings();
	}

	@Override
	public List<String> userfindBook(int userId) {
		return bookdao.userfindBook(userId);
	}

	@Override
	public Booking appfind(int bookingId) {
		return bookdao.appfind(bookingId);

	}

	@Override
	public List<Integer> getBookingId() {
		return bookdao.getBookingId();

	}

	@Override
	public Object getApprovedCount() {
		return bookdao.getApprovedCount();
	}

	@Override
	public Object getRejectedCount() {
		return bookdao.getRejectedCount();

	}

	@Override
	public Object getPendingCount() {
		return bookdao.getPendingCount();

	}

	@Override
	public boolean updateApprovedBooking(int bookingId) {
		return bookdao.updateApprovedBooking(bookingId);
	}

	@Override
	public boolean updateRejectedBooking(int bookingId) {
		return bookdao.updateRejectedBooking(bookingId);
	}

	@Override
	public List<Booking> findBookingbyId(int userId) {
		return bookdao.findBookingbyId(userId);

	}

	@Override
	public boolean deleteBooking(int bookingId) {
		return bookdao.deleteBooking(bookingId);

	}

	@Override
	public boolean updatePayment(int bookingId) {
		return bookdao.updatePayment(bookingId);
	}

	@Override
	public Booking updateBook(Booking book) {
		return bookdao.updateBook(book);
	}

	@Override
	public List<Booking> getAllBookingDetails() {

		return bookdao.getAllBookingDetails();
	}

	@Override
	public Object getPaymentCount() {

		return bookdao.getPaymentCount();
	}

	@Override
	public List<Booking> getPaymentBookings() {

		return bookdao.getPaymentBookings();
	}

}
