package com.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tms.bean.Booking;
import com.tms.repository.BookingDao;

@RestController
@CrossOrigin("*")
public class BookingController {

	@Autowired
	BookingDao bookdao;
	// to insert the data

	@PostMapping("/doBookingInsert")
	public Booking insertBooking(@RequestBody Booking newBooking) {
		newBooking.setBookingStatus("pending");
		return bookdao.insertBooking(newBooking);

	}

	@PutMapping("/updateBooking/{bookingId}")
	public boolean updateApprovedBooking(@PathVariable("bookingId") int bookingId) {
		System.out.println(bookingId);
		return bookdao.updateApprovedBooking(bookingId);
	}

	@PutMapping("/rejectBooking/{bookingId}")
	public boolean updateRejectedBooking(@PathVariable("bookingId") int bookingId) {
		System.out.println(bookingId);
		return bookdao.updateRejectedBooking(bookingId);
	}

	// to get all the data from the database
	@GetMapping("/getpendingBookingList")
	public List<Booking> getBookings() {
		return bookdao.getPendingBookings();
	}

	@GetMapping("/getApprovedBookingList")
	public List<Booking> getApproveBookings() {
		return bookdao.getApprovedBookings();
	}

	@GetMapping("/getRejectedBookingList")
	public List<Booking> getRejectedBookings() {
		return bookdao.getRejectedBookings();
	}

	// get by id
	@GetMapping("/GetBookingId/{bookingId}")
	public Booking appfind(@PathVariable("bookingId") int bookingId) {
		return bookdao.appfind(bookingId);
	}

	@GetMapping("/GetUserIdBook/{userId}")
	public Booking userfindBook(@PathVariable("userId") int userId) {
		return bookdao.userfindBook(userId);
	}

	// to get all the Id
	@GetMapping("/getBookingIdList")
	public List<Integer> getBookingId() {
		return bookdao.getBookingId();
	}

	@GetMapping("/getapproveCount")
	public Object getApprovedCount() {
		return bookdao.getApprovedCount();
	}

	@GetMapping("/getrejectedCount")
	public Object getRejectedCount() {
		return bookdao.getRejectedCount();
	}

	@GetMapping("/getpendingCount")
	public Object getPendingCount() {
		return bookdao.getPendingCount();
	}

}
