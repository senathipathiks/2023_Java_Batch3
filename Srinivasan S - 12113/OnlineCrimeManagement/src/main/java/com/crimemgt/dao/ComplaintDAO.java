package com.crimemgt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;

import com.crimemgt.entity.Complaint;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class ComplaintDAO {

	@Autowired
	EntityManager complaintManager;
	
	@Autowired
	private JavaMailSender mailSender;

	public Complaint addComplaint(Complaint complaint) {
		complaintManager.persist(complaint);
		return complaint;
	}

	public boolean updatemailComplaint(int complaintId) {
		Query query = complaintManager.createQuery("from Complaint c where c. complaintId=?1");
		query.setParameter(1, complaintId);
		Complaint complaint = (Complaint) query.getSingleResult();
		String userEmail = complaint.getUser().getEmail();
		String userName = complaint.getUser().getUserName();
		String stationName = complaint.getStation().getStationName();
		String stationLoc = complaint.getStation().getStationLoc();
		long stationPhn=complaint.getStation().getStationPhn();

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("t975615@gmail.com");
		message.setTo(userEmail);
		message.setText("Dear " +userName +"\r\n This is the message from cyber crime."
				+ "\r\n Complaint raised by you is solved by the department. Kindly reachout to "+stationName+" - "+stationLoc+" Police station"
				+"\r\n In case of any queries, please reach out to this number "+stationPhn
				+"\r\n Thank you");
		message.setSubject("Regarding your complaint raised in Crime management");

		mailSender.send(message);

		return true;
	}

	public boolean updateComplaint(int complaintId) {
		Query query = complaintManager
				.createQuery("UPDATE Complaint b SET b.status = :newStatus WHERE b.complaintId = :complaintId");
		query.setParameter("complaintId", complaintId);
		query.setParameter("newStatus", "Solved");
		query.executeUpdate();
		updatemailComplaint(complaintId);
		return true;
	}

	public boolean rejectComplain(int complaintId) {
		Query query = complaintManager
				.createQuery("UPDATE Complaint b SET b.status = :newStatus WHERE b.complaintId = :complaintId");
		query.setParameter("complaintId", complaintId);
		query.setParameter("newStatus", "Withdrawn");
		query.executeUpdate();
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Complaint> getAllcomplaints() {
		return complaintManager.createQuery("from Complaint").getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Complaint> getpendingcomplaints(int stationId) {
		Query query = complaintManager
				.createQuery("from Complaint c where c.status = 'pending' AND c.station.stationId=:getpendstationId");
		query.setParameter("getpendstationId", stationId);
		return query.getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Complaint> getsolvedcomplaints(int stationId) {
		Query query = complaintManager
				.createQuery("from Complaint c where c.status = 'solved' AND c.station.stationId=:getstationId");
		query.setParameter("getstationId", stationId);
		return query.getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Complaint> getrejectedcomplaints(int stationId) {
		Query query = complaintManager
				.createQuery("from Complaint c where c.status = 'Withdrawn'AND c.station.stationId=:rejectstationId");
		query.setParameter("rejectstationId", stationId);
		return query.getResultList();

	}

	public Complaint searchComplaints(int complaintId) {
		Query query = complaintManager.createQuery("from Complaint c where c. complaintId=?1");
		query.setParameter(1, complaintId);
		return (Complaint) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public List<Complaint> highPrioritycomplaints() {
		return complaintManager.createQuery("from Complaint c where c.priority = 'high'").getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Complaint> mediumPrioritycomplaints() {
		return complaintManager.createQuery("from Complaint c where c.priority = 'medium'").getResultList();

	};

	@SuppressWarnings("unchecked")
	public List<Complaint> lessPrioritycomplaints() {
		return complaintManager.createQuery("from Complaint c where c.priority = 'low'").getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Complaint> findpriority(String priority) {
		
		return complaintManager.createQuery("select s from Complaint s where priority = :priority")
				.setParameter("priority", priority).getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Complaint> findusercomplaintbyId(int userId) {
		Query query = complaintManager.createQuery(" FROM Complaint b WHERE b.user.userId = :userId");
		query.setParameter("userId", userId);
		return query.getResultList();
	}

	public Object pendingCount(int stationId) {
		Query query = complaintManager.createQuery(
				"select count(*) from Complaint b where b.status = 'pending' AND b.station.stationId = :pendstationId");
		return query.setParameter("pendstationId", stationId).getSingleResult();

	}

	public Object solvedCount(int stationId) {
		Query query = complaintManager.createQuery(
				"select count(*) from Complaint b where b.status = 'Solved' AND b.station.stationId = :solvestationIid");
		return query.setParameter("solvestationIid", stationId).getSingleResult();

	}

	public Object withdrawnCount(int stationId) {
		Query query = complaintManager.createQuery(
				"select count(*) from Complaint b where b.status = 'Withdrawn' AND b.station.stationId = :stationid");
		return query.setParameter("stationid", stationId).getSingleResult();

	}
}
