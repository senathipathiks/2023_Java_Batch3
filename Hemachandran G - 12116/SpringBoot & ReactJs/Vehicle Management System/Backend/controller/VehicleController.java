package com.vms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vms.model.Vehicle;
import com.vms.repo.Repository;

@RestController

@CrossOrigin("http://localhost:3000")
public class VehicleController {

	@Autowired
	Repository repo;

	@GetMapping("GetVehicle")
	public List<Vehicle> loadAll() {
		List<Vehicle> vlist = (List<Vehicle>) repo.findAll();
		return vlist;
	}
	@GetMapping("GetVehicleById/{vehicleId}")
	public Optional<Vehicle> getById(@PathVariable int vehicleId) {
		return repo.findById(vehicleId);
	}

	@PostMapping("CreateVehicle")
	public String doInsert(@RequestBody Vehicle vehi) {
		String msg;
		try {
			repo.save(vehi);
			msg = "Data Saved Succesfully";
		} catch (Exception e) {
			msg = " Data Failed to Insert";
		}
		return msg;
	}

	@PutMapping("UpdateVehicle/{vehicleId}")
	public Optional<Object> doUpdate(@RequestBody Vehicle vehi, @PathVariable int vehicleId) {
		return repo.findById(vehicleId).map(vehicle -> {
			vehicle.setVehicleName(vehi.getVehicleName());
			vehicle.setVehicleType(vehi.getVehicleType());
			vehicle.setVehicleBrand(vehi.getVehicleBrand());
			vehicle.setFuelEntity(vehi.getFuelEntity());
			vehicle.setWeight(vehi.getWeight());
			return repo.save(vehicle);
		});
	}
	
	
	@DeleteMapping("DeleteVehicle/{vehicleId}")
	public String doDelete(@PathVariable("vehicleId") int vehicleId) {
		String msg;
		try {
			repo.deleteById(vehicleId);
			msg = "Deleted Successful";
		}catch (Exception e) {
			msg = "Deletion Failed";
		}
		return msg;
	}
	
	@PostMapping("EditOrDelete/{btn}")
	public String editOrDelete(@PathVariable String btn, @RequestBody Vehicle vehi) {
		String msg = null;
		if(btn==("Edit")) {
			repo.save(vehi);
			msg = "Updated Succefully";
		}
		if(btn==("Delete")) {
			repo.deleteById(vehi.getVehicleId());
			msg = "Deleted Successfully";
		}
		
		return msg;
	}

}
