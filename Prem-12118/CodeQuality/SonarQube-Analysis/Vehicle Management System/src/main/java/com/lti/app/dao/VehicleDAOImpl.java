package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Login;
import com.lti.app.pojo.Vehicle;

@Repository
public class VehicleDAOImpl implements VehicleDAO
{
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addVehicle(Vehicle vehicle) {
		eMan.persist(vehicle);
		return true;
	}

	@Override
	public List<Vehicle> getVehicles() {
		return eMan.createQuery("from Vehicle").getResultList();
	}

	public Vehicle findVehicle(String vehicleId) {
	    return eMan.find(Vehicle.class, vehicleId);
	}


	@Override
	public boolean updateVehicle(Vehicle vehicle) {
				eMan.merge(vehicle);
		return true;
	}

	@Override
	public boolean deleteVehicle(String vehId) {
		Vehicle obj=eMan.find(Vehicle.class,vehId);
		eMan.remove(obj);
		return true;
	}

	@Override
	public boolean validateLogin(String logid, String pass) {
		Query qry2 = eMan.createQuery("from Login log where log.loginid = ?1 and log.passwd = ?2");
		qry2.setParameter(1, logid);
		qry2.setParameter(2, pass);

		List<Login> users = qry2.getResultList();
		return !users.isEmpty();
	}

	@Override
	public List<Vehicle> searchVehicles(String manufac) {
	    Query qry2 = eMan.createQuery("from Vehicle v where v.manufac = ?1");
	    qry2.setParameter(1, manufac);
	    return qry2.getResultList();
	}


}
