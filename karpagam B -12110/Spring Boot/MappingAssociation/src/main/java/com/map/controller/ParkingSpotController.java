package com.map.controller;

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

import com.map.bean.ParkingSpot;
import com.map.repository.ParkingSpotRepository;


@RestController
@CrossOrigin("*")
public class ParkingSpotController {
	
	@Autowired
	private ParkingSpotRepository parkRepo;
	
	//to insert the data
	@PostMapping("/ParkInsert")
	ParkingSpot newParkingSpot(@RequestBody ParkingSpot newParkingSpot ) {
		return parkRepo.save(newParkingSpot);
	}
	
	//get all ParkingSpot details
	@GetMapping("/getAllPark")

	List<ParkingSpot> getAllParkingSpot() {
		return (List<ParkingSpot>) parkRepo.findAll();
	}	
	
	//delete
	@DeleteMapping("/doParkingSpotDelete/{id}")
	public String DeleteParkingSpot(@PathVariable("id") int id) {
		String msg = "";
		try {
			parkRepo.deleteById(id);
			msg = "ParkingSpot Data Deleted";
		} catch (Exception e) {
			msg = "ParkingSpot Data not Deleted";
		}
		return msg;
	}
	//get by id
	@GetMapping("/GetParkId/{id}")
	public Optional<ParkingSpot> doOrgFind(@PathVariable("id") int id) {
	   return parkRepo.findById(id);
	}

	//update
		@PutMapping("/doParkUpdate")
		ParkingSpot updateParkingSpot(@RequestBody ParkingSpot park) {

			return parkRepo.save(park);
		}

    //to get all the Id  
    @GetMapping("/getParkIdList")
		List<Integer> getParkbylist() {
			List<Integer> idlist = parkRepo.getAllParkId();
			return idlist;
			}

	
	
	

}
