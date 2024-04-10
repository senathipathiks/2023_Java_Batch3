package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.bean.Customer;
import com.product.repo.CustomerRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerRepo repo;
	
	@PostMapping("/insertCust")
	public String doInsert(@RequestBody Customer cust) {
		String msg="";
		try {
			repo.save(cust);
			msg="Insertion Successfull";
		}catch(Exception e) {
			msg = "Insertion Failure";
		}
		return msg;
		
		
	}
	
	@PutMapping("/updateCust")
	public String doUpdate(@RequestBody Customer cust) {
		String msg = "";
		try {
			repo.save(cust);
			msg="Updation successfull";
		}catch(Exception e) {
			msg="Upadtion failure";
		}
		return msg;
	}
	
	@GetMapping("/findIdCust/{cId}")
	public Customer doFindId(@PathVariable("cId")int cId){
	 Customer cust =  repo.findById(cId).get();
		return cust;
	}
	
	@GetMapping("/findNameCust/{cName}")
	public List<Customer> doFindName(@PathVariable("cName")String cName){
		List<Customer> cList =  repo.findBycName(cName);
		return cList;
	}
	
	@DeleteMapping("/deleteIdcust/{cId}")
	public String doDeleteId(@PathVariable("cId")int cId) {
		String msg="";
		try {
			repo.deleteById(cId);
			msg="Deletion is successfull";
		}catch(Exception e) {
			msg="Deletion failure";
		}
		return msg;
	}
	
	@DeleteMapping("/deleteNamecust/{cName}")
	public String doDeleteName(@PathVariable("cName")String cName) {
		String msg="";
		try {
			repo.deleteBycName(cName);
			msg="Deletion is successfull";
		}catch(Exception e) {
			msg="Deletion failure";
		}
		return msg;
	}
	
	@GetMapping("/getAllCust")
	public List<Customer> dofindAll(){
		List<Customer> cList = (List<Customer>) repo.findAll();
		return cList;
	}


}
