package com.crimemgt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crimemgt.dto.StationDTO;
import com.crimemgt.entity.Station;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class StationDAO {

	@Autowired
	EntityManager stationManager;

	public Station addStation(Station station) {
		stationManager.persist(station);
		return station;

	}

	public Station stationLogin(int stationId, String stationPassword) {
		Query query1 = stationManager.createQuery("from Station s where s.stationId =?1 and s.stationPassword=?2");
		query1.setParameter(1, stationId);
		query1.setParameter(2, stationPassword);

		return (Station) query1.getSingleResult();

	}

	@SuppressWarnings("unchecked")
	public List<StationDTO> getAllStations() {
		return stationManager.createQuery("from Station").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Integer> getAllstationId() {
		return stationManager.createQuery("SELECT s.stationId FROM Station s").getResultList();
	}

	public Object getstationId(String stationLoc) {
		Query q1 = stationManager.createQuery(" SELECT s.stationId FROM Station s WHERE s.stationLoc = :stationLoc");
		q1.setParameter("stationLoc", stationLoc);
		return q1.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public List<Station> searchStation(int stationId) {
		Query query = stationManager.createQuery("from Station c where c. stationId=?1");
		query.setParameter(1, stationId);
		return query.getResultList();
	}

}
