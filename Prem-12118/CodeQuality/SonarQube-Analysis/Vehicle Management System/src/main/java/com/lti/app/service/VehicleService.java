package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Vehicle;

public interface VehicleService
{
	public boolean addVehicle(Vehicle vehicle);
	public List<Vehicle> getVehicles();
	
	public Vehicle findVehicle(String vehicleId);
	
	public boolean updateVehicle(Vehicle vehicle);
	
	public boolean deleteVehicle(String vehId);
	
	public boolean validateLogin(String logid,String pass);
	
	public List<Vehicle> searchVehicles(String manufac);
}
