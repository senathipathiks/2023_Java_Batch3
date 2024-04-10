package com.springboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Customer;
import com.springboot.repo.CustomerRepo;



@RestController
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	CustomerRepo repo;

	@PostMapping("CreateCustomer")
	public String createCustomer(@RequestBody Customer customer) {
		String msg="";
		try {
			repo.save(customer);
			msg="Inserted Successfully";
		} catch (Exception e) {
			msg="Failed to Insert";
		}
		return msg;
	}
	
	
	@GetMapping("GetAllCustomer")
	public ArrayList<Customer> getAllCustomer(){
		return (ArrayList<Customer>) repo.findAll();
	}

	@DeleteMapping("DeleteCustomer/{cid}")
	public String doDelete(@PathVariable("cid")int cid) {
		String Msg="";
		try {
			repo.deleteById(cid);
			Msg="Record Deleted";
		} catch (Exception e) {
			Msg="Record Not Deleted";
		}
		return Msg;	
	}
	
	@PutMapping("/UpdateCustomer/{cid}")
	public String doupdate(@PathVariable int cid ,@RequestBody Customer customer) {
		String Msg="";
		try {	
			if (repo.existsById(cid)) {
				customer.setCid(cid);
				repo.save(customer);
				Msg="Record updated Successfully";
			}
			
		} catch (Exception e) {
			Msg="Record updation Failed";
		}
		
		return Msg;
	}
	
	@GetMapping("GetCustomerById/{cid}")
	public Customer findCustomerById(@PathVariable("cid")int cid) {
		return repo.findById(cid).get();	
	}
	
	@GetMapping("CustomerIdList")
	public ArrayList<Integer> getIdList(){
		return repo.getId();
	}
}



