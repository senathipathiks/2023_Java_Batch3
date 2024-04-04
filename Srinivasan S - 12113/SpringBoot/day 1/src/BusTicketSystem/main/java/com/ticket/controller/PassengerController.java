package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.model.Passenger;
import com.ticket.repository.PassengerRepository;

@RestController
@CrossOrigin
public class PassengerController {

	@Autowired 
	private PassengerRepository passengerRepo;
	
	@PostMapping("/addpass")
	Passenger pass(@RequestBody Passenger pass) {
//		System.out.println(pass);
		return passengerRepo.save(pass);
	}
	
	@PutMapping("/updatepass")
	public Passenger updatePass(@RequestBody Passenger pass) {
		return passengerRepo.save(pass);
				
	}
	
	@GetMapping("/passenger")
	List<Passenger> getAllBus()
	{
		return passengerRepo.findAll();
	}
	
	@GetMapping("/findPassengerbyId/{passengerId}")
	Passenger findBusId(@PathVariable int passengerId){
		Passenger pass=passengerRepo.findByPassengerId(passengerId);
		return pass;
	}
	
	@GetMapping("/getAllpassengerids")
	List<Integer> findAllBusIds(){
		List<Integer> pass= passengerRepo.getPassengerId();
		return pass;
	}

	
	@DeleteMapping("deletepass/{passengerId}")
	public String deleteAPssenger(@PathVariable int passengerId) {
		passengerRepo.deleteById(passengerId);
		return "Item with id " + passengerId + " has been deleted successfully.";
		
	} 
	
}
