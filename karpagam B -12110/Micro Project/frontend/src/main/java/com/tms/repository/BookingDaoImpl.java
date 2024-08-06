package com.tms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tms.bean.Booking;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class BookingDaoImpl implements BookingDao {

	@Autowired
	EntityManager entityMan;

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

	@Override
	public Booking userfindBook(int userId) {
		return entityMan.find(Booking.class, userId);

	}

	@Override
	public Booking appfind(int bookingId) {
		return entityMan.find(Booking.class, bookingId);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getBookingId() {
		Query q = entityMan.createQuery("SELECT c.bookingId FROM Booking c");
		List<Integer> list = q.getResultList();
		return list;
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

	// update to approved bookings
	@Override
	public boolean updateApprovedBooking(int bookingId) {
		Query query = entityMan
				.createQuery("UPDATE Booking b SET b.bookingStatus = :newStatus WHERE b.bookingId = :bookingId");
		query.setParameter("bookingId", bookingId);
		query.setParameter("newStatus", "approved");
		query.executeUpdate();
		return true;
	}

	// update to rejected bookings
	@Override
	public boolean updateRejectedBooking(int bookingId) {
		Query query = entityMan.createQuery("UPDATE Booking b SET b.bookingStatus = :newStatus WHERE b.bookingId = :bookingId");
		query.setParameter("bookingId", bookingId);
		query.setParameter("newStatus", "rejected");
		query.executeUpdate();
		return true;
	}

}
