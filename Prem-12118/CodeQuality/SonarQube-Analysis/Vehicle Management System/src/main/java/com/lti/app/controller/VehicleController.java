package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Vehicle;
import com.lti.app.service.VehicleService;

@RestController
@RequestMapping("/rest/api/")
@CrossOrigin("http://localhost:4200")
public class VehicleController 
{
		@Autowired
		VehicleService vService;
	
		@GetMapping("/vehicle")
		public List<Vehicle> getVehicles()
		{
			return vService.getVehicles();
		}
		@PostMapping("/vehicle")
		public boolean addVehicle(@RequestBody Vehicle vehicle)
		{
			return vService.addVehicle(vehicle);
		}
		@GetMapping("/vehicle/{vehicleid}") // Passing Argumet with URL and Fiding the Object
		public Vehicle findVehicle(@PathVariable("vehicleid") String vehicleId)
		{
				return vService.findVehicle(vehicleId);
		}
		@PutMapping("/vehicle") //For Updating 
		public boolean updateVehicle(@RequestBody Vehicle vehicle)
		{
			return vService.updateVehicle(vehicle);
		}
		@DeleteMapping("/vehicle/{vehicleid}") //For deleting
		public boolean deleteVehicle(@PathVariable("vehicleid") String vehicleId)
		{
			  return vService.deleteVehicle(vehicleId);
		}
		@GetMapping("/validatelogin/{logid}/{passwd}") // Passing multiple arguments with url
		public boolean validateLogin(@PathVariable("logid") String id,@PathVariable("passwd") String pass)
		{
				return vService.validateLogin(id, pass);
		}
		@GetMapping("/vehiclebymaker/{manufac}") 
		public List<Vehicle> searchVehicles(@PathVariable("manufac")  String manuf)
		{
			return vService.searchVehicles(manuf);
		}
		
}
