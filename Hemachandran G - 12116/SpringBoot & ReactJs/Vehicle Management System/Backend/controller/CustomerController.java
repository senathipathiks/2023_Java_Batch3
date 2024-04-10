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

import com.vms.model.Customer;
import com.vms.repo.CustomerRepo;



@RestController

@CrossOrigin("http://localhost:3000")

public class CustomerController {

	
	@Autowired
	CustomerRepo repo;
	
	@GetMapping("GetAllCustomer")
	public List<Customer> getAll() {
		List<Customer> clist = (List<Customer>) repo.findAll();
		return clist;
	}
	@GetMapping("GetCustomerByID/{customerId}")
	public Optional<Customer> gettById(@PathVariable int customerId) {
		return repo.findById(customerId);  
	}
	
	@GetMapping("ById")
	public List<Integer> loadById() {

			List<Integer> list = repo.getIdList();
		
		return list;
		
	}

	@PostMapping("CreateCustomer")
	public String dooInsert(@RequestBody Customer cus) {
		String msg;
		try {
			repo.save(cus);
			msg = "Data Saved Succesfully";
		} catch (Exception e) {
			msg = " Data Failed to Insert";
		}
		return msg;
	}

	@PutMapping("UpdateCustomer/{customerId}")
	public Optional<Object> dooUpdate(@RequestBody Customer cus, @PathVariable int customerId) {
		return repo.findById(customerId).map(customer -> {
			customer.setCustomerName(cus.getCustomerName());
			customer.setCustomerAddress(cus.getCustomerAddress());
			customer.setCustomerPhnNo(cus.getCustomerPhnNo());
			
			return repo.save(customer);
		});
	}
	
	
	@DeleteMapping("DeleteCustomer/{customerId}")
	public String dooDelete(@PathVariable("customerId") int customerId) { 
		String msg;
		try {
			repo.deleteById(customerId);
			msg = "Deleted Successful";
		}catch (Exception e) {
			msg = "Deletion Failed";
		}
		return msg;
	}
	
	
}
