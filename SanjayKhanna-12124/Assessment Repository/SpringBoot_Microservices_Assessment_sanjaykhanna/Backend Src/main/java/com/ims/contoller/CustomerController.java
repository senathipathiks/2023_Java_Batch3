package com.ims.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ims.entity.Customer;
import com.ims.repository.CustomerRepo;

@RestController
@CrossOrigin("http://localhost:3030")
public class CustomerController {

	@Autowired
	CustomerRepo repo;
	
	@PostMapping("/createcustomer")
	public String createCustomer(@RequestBody Customer c) {
		String msg = "";

		try {
			repo.saveAndFlush(c);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}
	
	@GetMapping("/readallcustomer")
	public List<Customer> readAllCustomer() {
		return repo.getAllCustomer();
	}
	
	@GetMapping("/readcustomer")
	public Customer readCustomer(@RequestParam("id")int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/updatecustomer")
	public String updateCustomer(@RequestBody Customer c) {
		
		String msg = "";

		try {
			repo.saveAndFlush(c);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}
	
	@DeleteMapping("/deletecustomer")
	public String deleteCustomer(@RequestParam("id")int id) {
		String msg = "";

		try {
			repo.deleteById(id);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}
	
}
