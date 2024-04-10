package com.rrs.controller;

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
import com.rrs.bean.Passenger;
import com.rrs.repository.PassengerRepository;


@RestController
@CrossOrigin("http://localhost:3000/")
public class PassengerController {

	@Autowired
	PassengerRepository repo;

	@PostMapping("/AddPassenger")
	public String addPassenger(@RequestBody Passenger passenger) {
		String msg = "";
		try {
			repo.save(passenger);
			msg = "Passenger Object Saved";
		} catch (Exception e) {
			msg = "Passenger Object Not Saved";
		}
		return msg;
	}

	@PutMapping("/UpdatePassenger")
	public String updatePassenger(@RequestBody Passenger passenger) {
		String msg = "";
		try {
			repo.save(passenger);
			msg = "Passenger Object Updated";
		} catch (Exception e) {
			msg = "Passenger Object Not Updated";
		}
		return msg;
	}

	@DeleteMapping("/DeletePassenger/{pid}")
	public String deletePassenger(@PathVariable("pid") int pid) {
		String msg = "";
		try {
			repo.deleteById(pid);
			msg = "Passenger Object Deleted";
		} catch (Exception e) {
			msg = "Passenger Object Not Deleted";
		}
		return msg; 
	}

	@GetMapping("/GetPassenger/{pid}")
	public Optional<Passenger> performFind(@PathVariable("pid") int pid) {
		 return repo.findById(pid);
		
	}

	@GetMapping("/GetAllPassenger")
	List<Passenger> getAllPassenger() {
		return (List<Passenger>) repo.findAll();
	}

	@GetMapping("/GetPassengerIds")
	public List<Integer> getPassengerIds() {
		return repo.fetchPassengerIds();
	}

}
