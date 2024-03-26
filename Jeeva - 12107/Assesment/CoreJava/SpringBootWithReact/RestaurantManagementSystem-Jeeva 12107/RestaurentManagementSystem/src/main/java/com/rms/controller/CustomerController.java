package com.rms.controller;

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


import com.rms.bean.Customer;
import com.rms.repositary.CustomerRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class CustomerController {
	
	@Autowired
	private CustomerRepo crepo;
	
	@PostMapping("/insertCustomer")
	public String insertCustomer(@RequestBody Customer cus) {
		String Msg="";
		try {
			crepo.save(cus);
			Msg= "Customer Record Inserted";
		}catch(Exception e) {
			System.out.println(e);
			Msg= "Failed To Insert";
		}
		return Msg;
	}
	
	
	 @PutMapping("/updateCustomerDetails")
	 public String updateEmployee(@RequestBody Customer eidd) {
		 String Msg="";
			try {
				crepo.save(eidd);
				Msg= "Customer Record Updated";
			}catch(Exception e) {
				System.out.println(e);
				Msg= "Failed To Update";
			}
			return Msg;
		}
	 
	
	
	@DeleteMapping("/deleteCusById/{cid}")
	public String deleteCusById(@PathVariable int cid) {
		
		try {
			
			crepo.deleteById(cid);			
			return "Deletion Success";
			
		}catch(Exception e) {
			System.out.println(e);
			return "Failed To Delete";
		}
	}
	
	
	 @GetMapping("/getAllCustomers")
	 public List<Customer> getAllCustomers(){		 
	List<Customer> getAllCustomer=crepo.findAll();		 
		return getAllCustomer;
		 
	 }
	 
	 
	 @GetMapping("/getAllCusId")
	 public List<Integer> getAllCusId(){
		List<Integer> idList=crepo.findAllId();
		return idList;
		
	 }
	 
	 @GetMapping("/findCusById/{cid}")
	 public Customer findCusById(@PathVariable int cid){
			return crepo.findById(cid).get();		
	 }
	 

}
