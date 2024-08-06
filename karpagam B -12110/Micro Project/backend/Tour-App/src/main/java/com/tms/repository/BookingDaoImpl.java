package com.tms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;

import com.tms.bean.Booking;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class BookingDaoImpl implements BookingDao {

	@Autowired
	EntityManager entityMan;

	@Autowired
	private JavaMailSender mailsender;

	@Override
	public Booking insertBooking(Booking newBooking) {
		entityMan.persist(newBooking);
		return newBooking;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Booking> getPendingBookings() {
		return entityMan.createQuery("from Booking b where b.bookingStatus = 'pending'").getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Booking> getApprovedBookings() {
		return entityMan.createQuery("from Booking b where b.bookingStatus = 'approved'").getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Booking> getRejectedBookings() {
		return entityMan.createQuery("from Booking b where b.bookingStatus = 'rejected'").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Booking> getPaymentBookings() {
		return entityMan.createQuery("from Booking b where b.bookingStatus = 'payment done'").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Booking> getAllBookingDetails() {
		return entityMan.createQuery("from Booking").getResultList();

	}

	@Override
	public Booking appfind(int bookingId) {
		return entityMan.find(Booking.class, bookingId);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getBookingId() {
		Query q = entityMan.createQuery("SELECT c.bookingId FROM Booking c");
		return q.getResultList();
	}

	// count function
	@Override
	public Object getApprovedCount() {
		Query query = entityMan.createQuery("select count(*) from Booking b where b.bookingStatus = 'approved' ");
		return query.getSingleResult();

	}

	@Override
	public Object getRejectedCount() {
		Query query = entityMan.createQuery("select count(*) from Booking b where b.bookingStatus = 'rejected' ");
		return query.getSingleResult();

	}

	@Override
	public Object getPendingCount() {
		Query query = entityMan.createQuery("select count(*) from Booking b where b.bookingStatus = 'pending' ");
		return query.getSingleResult();

	}
	
	@Override
	public Object getPaymentCount() {
		Query query = entityMan.createQuery("select count(*) from Booking b where b.bookingStatus = 'payment done' ");
		return query.getSingleResult();

	}


	@SuppressWarnings("unchecked")
	@Override
	public List<String> userfindBook(int userId) {
		Query query = entityMan.createQuery("SELECT b.bookingStatus FROM Booking b WHERE b.user.userId = :userId");
		query.setParameter("userId", userId);
		return query.getResultList();
	}

	// update to approved bookings
	@Override
	public boolean updateApprovedBooking(int bookingId) {
		Query query = entityMan
				.createQuery("UPDATE Booking b SET b.bookingStatus = :newStatus WHERE b.bookingId = :bookingId");
		query.setParameter("bookingId", bookingId);
		query.setParameter("newStatus", "approved");
		query.executeUpdate();
		updatemailBooking(bookingId);
		return true;
	}

	@Override
	public boolean updatePayment(int bookingId) {
		Query query = entityMan
				.createQuery("UPDATE Booking b SET b.bookingStatus = :newStatus WHERE b.bookingId = :bookingId");
		query.setParameter("bookingId", bookingId);
		query.setParameter("newStatus", "payment done");
		query.executeUpdate();
		return true;
	}

	// update to rejected bookings
	@Override
	public boolean updateRejectedBooking(int bookingId) {
		Query query = entityMan
				.createQuery("UPDATE Booking b SET b.bookingStatus = :newStatus WHERE b.bookingId = :bookingId");
		query.setParameter("bookingId", bookingId);
		query.setParameter("newStatus", "rejected");
		query.executeUpdate();
		updateEmailRejected(bookingId);
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Booking> findBookingbyId(int userId) {
		Query query = entityMan.createQuery(" FROM Booking b WHERE b.user.userId = :userId");
		query.setParameter("userId", userId);
		return query.getResultList();
	}

	@Override
	public boolean deleteBooking(int bookingId) {
		Query query = entityMan.createQuery("DELETE Booking b WHERE b.bookingId = :bookingId");
		query.setParameter("bookingId", bookingId);
		query.executeUpdate();
		return true;
	}

	@Override
	public Booking updateBook(Booking book) {
		entityMan.merge(book);
		return book;
	}

	@Override
	public boolean updatemailBooking(int bookingId) {
		Query query = entityMan.createQuery("from Booking c where c. bookingId=?1");
		query.setParameter(1, bookingId);
		Booking book = (Booking) query.getSingleResult();
		String userEmail = book.getUser().getUserEmail();
		String userName = book.getUser().getUserName();
		String packagename = book.getPackagedetails().getPackageName();
		String cost = book.getPackagedetails().getPrice();

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("karpagamsai1602@gmail.com");
		message.setTo(userEmail);
		message.setText("Dear " + userName + "\r\nThis is from Alpha Tourism."
				+ "\r\nWe are glad to Inform that Your booking package " + packagename + " is approved."
				+ "\r\nplease pay your amount Rupees " + cost + " for the booking package, Happy Journeyyy!!"
                +"\r\n"
				+ "\r\nIn case of any queries, please reach out to us  \r\n Thank you");
		message.setSubject("Regarding Booking confrmation - Aplha tourism");

		mailsender.send(message);

		return true;
	}

	@Override
	public boolean updateEmailRejected(int bookingId) {
		Query query = entityMan.createQuery("from Booking c where c.bookingId=?1");
		query.setParameter(1, bookingId);
		Booking book = (Booking) query.getSingleResult();
		String userEmail = book.getUser().getUserEmail();
		String userName = book.getUser().getUserName();
		String packagename = book.getPackagedetails().getPackageName();

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("karpagamsai1602@gmail.com");
		message.setTo(userEmail);
		message.setText("Dear " + userName + "\r\nThis is from Alpha Tourism."
				+ "\r\nWe regret to Inform You that your booking package " + packagename
				+ " is Rejected because of the following one reason" + "\r\n* Because of Natural Calamities"
				+ "\r\n* Booking overloaded"

				+ "\r\n In case of any queries, please reach out to us  \r\n Thank you");
		message.setSubject("Regarding Booking Rejection - Aplha tourism");

		mailsender.send(message);

		return true;
	}

}
