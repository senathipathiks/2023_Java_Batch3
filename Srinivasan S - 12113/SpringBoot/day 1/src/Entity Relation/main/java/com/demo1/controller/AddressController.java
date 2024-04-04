package com.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo1.model.Address;
import com.demo1.model.Mobile;
import com.demo1.repository.AddressRepository;

@RestController
public class AddressController {
	
	@Autowired 
	private AddressRepository addressRepo;
	
	@PostMapping("/addAddress")
	public Address adduser(@RequestBody Address address) {
		return addressRepo.saveAndFlush(address);
	}
	
	@GetMapping("/findAddressById/{addressId}")
	public Address findaddressbyId(@PathVariable int addressId) {
		return addressRepo.findByAddressId(addressId);
	}
	
	@GetMapping("/findAllAddress")
	public List<Address> findAllUsers(){
		return addressRepo.findAll();
	}
	
	@GetMapping("/findAddressByName/{city}")
	public List<Address> findaddressbyName(@PathVariable String city) {
		return addressRepo.findByCityContaining(city);
	}
	
	
	@PutMapping("/updateAddress")
	public Address updateAddress(@RequestBody Address address) {
		return addressRepo.save(address);
	}
	
	@DeleteMapping("/deleteAddress/{addressId}")
	public String deleteUser(@PathVariable int addressId) {
		addressRepo.deleteById(addressId);
		return addressId+" deleted successfully";
	}
	

}
