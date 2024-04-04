package com.demo1.controller;

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

import com.demo1.model.Address;
import com.demo1.model.Mobile;
import com.demo1.model.User;
import com.demo1.repository.MobileRepository;

@RestController
@CrossOrigin("*")
public class MobileController {

	@Autowired
	private MobileRepository mobileRepo;
	
	@PostMapping("/addMobile")
	public Mobile adduser(@RequestBody Mobile mobile) {
		return mobileRepo.saveAndFlush(mobile);
	}
	
	@GetMapping("/findMobileById/{mobileId}")
	public Mobile findmobilebyId(@PathVariable int mobileId) {
		return mobileRepo.findByMobileId(mobileId);
	}
	
	@GetMapping("/findAllMobile")
	public List<Mobile> findAllUsers(){
		return mobileRepo.findAll();
	}
	
	@GetMapping("/findMobileByBrand/{brand}")
	public List<Mobile> findMobilebyBrand(@PathVariable String brand) {
		return mobileRepo.findByBrandContaining(brand);
	}
	
	@PutMapping("/updateMobile")
	public Mobile updateMobile(@RequestBody Mobile mobile) {
		return mobileRepo.save(mobile);
	}
	
	@DeleteMapping("/deleteMobile/{mobileId}")
	public String deleteUser(@PathVariable int mobileId) {
		mobileRepo.deleteById(mobileId);
		return mobileId+" deleted successfully";
	}
}
