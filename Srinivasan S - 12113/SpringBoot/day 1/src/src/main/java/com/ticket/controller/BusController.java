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

import com.ticket.model.Bus;
import com.ticket.repository.BusRepository;


@RestController
@CrossOrigin()
public class BusController {
	
	@Autowired
	private BusRepository busRepo;
	
	@PostMapping("/addbus")
	Bus bus(@RequestBody Bus bus) {
		System.out.println(bus);
		return busRepo.save(bus);
	}
	
	@PutMapping("/updatebus")
	public Bus updateBus(@RequestBody Bus bus) {
		return busRepo.save(bus);
	}
	
	
	@GetMapping("/bus")
	List<Bus> getAllBus()
	{
		return busRepo.findAll();
	}
	
	@GetMapping("/findBusbyName/{busName}")
	List<Bus> findBusName(@PathVariable String busName){
		
		List<Bus> bus=busRepo.findByBusName(busName);
		return bus;
		
	}
	
	@GetMapping("/findBusbyId/{busId}")
	Bus findBusId(@PathVariable int busId){
	return	busRepo.findByBusId(busId);
	
	}
	
	@GetMapping("/getAllbusids")
	List<Integer> findAllBusIds(){
		List<Integer> bus= busRepo.getBusId();
		return bus;
	}
	
	@DeleteMapping("/deletebus/{busId}")
	public String deleteBus(@PathVariable int busId) {
		busRepo.deleteById(busId);
		return "Item with id " + busId + " has been deleted successfully.";
		
	}
	

}
