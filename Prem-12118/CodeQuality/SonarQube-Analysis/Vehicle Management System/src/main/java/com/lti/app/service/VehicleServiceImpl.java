package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.dao.VehicleDAO;
import com.lti.app.pojo.Vehicle;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleDAO vdao;

	@Override
	public boolean addVehicle(Vehicle vehicle) {
		return vdao.addVehicle(vehicle);
	}

	@Override
	public List<Vehicle> getVehicles() {
		return vdao.getVehicles();
	}

	@Override
	public Vehicle findVehicle(String vehicleId) {

		return vdao.findVehicle(vehicleId);
	}

	@Override
	public boolean updateVehicle(Vehicle vehicle) {

		return vdao.updateVehicle(vehicle);
	}

	@Override
	public boolean deleteVehicle(String vehId) {

		return vdao.deleteVehicle(vehId);
	}

	@Override
	public boolean validateLogin(String logid, String pass) {

		return vdao.validateLogin(logid, pass);
	}

	@Override
	public List<Vehicle> searchVehicles(String manufac) {

		return vdao.searchVehicles(manufac);
	}

}
