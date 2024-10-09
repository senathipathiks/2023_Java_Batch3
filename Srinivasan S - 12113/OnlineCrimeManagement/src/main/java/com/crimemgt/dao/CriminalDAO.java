package com.crimemgt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crimemgt.entity.Complaint;
import com.crimemgt.entity.Criminal;
import com.crimemgt.entity.Station;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class CriminalDAO {

	@Autowired
	EntityManager criminalManager;

	public Criminal addCriminal(Criminal criminal, int complaintId, int winId) {
		System.out.println("cmp id"+complaintId);
		Complaint comp = criminalManager.find(Complaint.class, complaintId);
		System.out.println(comp);
		Station stat = criminalManager.find(Station.class, winId);
		comp.setComplaintId(complaintId);
		stat.setStationId(winId);
		criminal.setComplaint(comp);
		criminal.setStation(stat);
		criminalManager.persist(criminal);
		return criminal;
	}

	@SuppressWarnings("unchecked")
	public List<Criminal> getAllcriminals() {
		return criminalManager.createQuery("from Criminal").getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Criminal> searchCriminals(int criminalId) {
		Query query = criminalManager.createQuery("from Criminal c where c. criminalId=?1");
		query.setParameter(1, criminalId);
		return query.getResultList();
	}

}
