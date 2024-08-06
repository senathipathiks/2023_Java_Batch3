package com.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tms.bean.Booking;
import com.tms.repository.BookingDao;
import com.tms.service.BookingService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class BookingController {

	@Autowired
	BookingService bookservice;

	@Autowired
	BookingDao bookdao;
	
	// to insert the data
	@PostMapping("/bookinginsert")
	public Booking insertBooking(@RequestBody Booking newBooking) {
		newBooking.setBookingStatus("pending");
		return bookservice.insertBooking(newBooking);

	}

	@PutMapping("/updatebooking/{bookingId}")
	public boolean updateApprovedBooking(@PathVariable("bookingId") int bookingId) {
		return bookservice.updateApprovedBooking(bookingId);
	}

	@PutMapping("/rejectBooking/{bookingId}")
	public boolean updateRejectedBooking(@PathVariable("bookingId") int bookingId) {
		return bookservice.updateRejectedBooking( bookingId);
	}

	@PutMapping("/updatePayment/{bookingId}")
	public boolean updateBooking(@PathVariable("bookingId") int bookingId) {
		return bookservice.updatePayment(bookingId);
	}

	// to get all the data from the database
	@GetMapping("/getpendingBookingList")
	public List<Booking> getBookings() {
		return bookservice.getPendingBookings();
	}

	@GetMapping("/getApprovedBookingList")
	public List<Booking> getApproveBookings() {
		return bookservice.getApprovedBookings();
	}

	@GetMapping("/getRejectedBookingList")
	public List<Booking> getRejectedBookings() {
		return bookservice.getRejectedBookings();
	}
	
	@GetMapping("/getPaymentBookingList")
	public List<Booking> getPaymentBookings() {
		return bookservice.getPaymentBookings();
	}

	// get by id
	@GetMapping("/GetBookingId/{bookingId}")
	public Booking appfind(@PathVariable("bookingId") int bookingId) {
		return bookservice.appfind(bookingId);
	}

	@GetMapping("/GetBookStatus/{userId}")
	public List<String> userfindBook(@PathVariable("userId") int userId) {
		return bookservice.userfindBook(userId);
	}

	@GetMapping("/getapproveCount")
	public Object getApprovedCount() {
		return bookservice.getApprovedCount();
	}

	@GetMapping("/getrejectedCount")
	public Object getRejectedCount() {
		return bookservice.getRejectedCount();
	}

	@GetMapping("/getpendingCount")
	public Object getPendingCount() {
		return bookservice.getPendingCount();
	}

	@GetMapping("/getpaymentCount")
	public Object getpaymentCount() {
		return bookservice.getPaymentCount();
	}

	@GetMapping("/getBookbyUserd/{userId}")
	public List<Booking> findBookingbyId(@PathVariable("userId") int userId) {
		return bookservice.findBookingbyId(userId);
	}

	@DeleteMapping("/deleteBooking/{bookingId}")
	public boolean deleteBooking(@PathVariable("bookingId") int bookingId) {
		return bookservice.deleteBooking(bookingId);

	}

	@PutMapping("/updatebook")
	public Booking updateBook(@RequestBody Booking book) {
		return bookservice.updateBook(book);
	}

	@PostMapping("/sendmail/{bookingId}")
	public boolean send(@PathVariable("bookingId") int bookingId) {
		return bookdao.updatemailBooking(bookingId);

	}

	@PostMapping("/sendreject/{bookingId}")
	public boolean sendReject(@PathVariable("bookingId") int bookingId) {
		return bookdao.updateEmailRejected(bookingId);
	}

	// to get all the data from the database
	@GetMapping("/getAllbookingList")
	public List<Booking> getBookingDetails() {
		return bookdao.getAllBookingDetails();
	}

}
