package com.osm.controller;

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
import com.osm.bean.Customer;
import com.osm.dao.CustomerDAO;

@RestController
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	@PostMapping("InsertCustomer")
	public Customer insertCustomer(@RequestBody Customer customer) {
	return customerDAO.save(customer);
	}
	
	@GetMapping("ViewAllCustomer")
	public List<Customer> viewAllCustomer(){
		return (List<Customer>) customerDAO.findAll();
	}
	
	@GetMapping("FindCustomer/{id}")
	public Customer findCustomer(@PathVariable Integer id) {
		return customerDAO.findById(id).get();
	}
	
	@PutMapping("/UpdateCustomerDetail")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerDAO.save(customer);
	}
	
	@DeleteMapping("/DeleteCustomer/{id}")
	public String deleteCustomer(@PathVariable Integer id) {
		String msg=" ";
		try {
			customerDAO.deleteById(id);
			msg="Customer Details Deleted Successfully";
		}catch(Exception e) {
			msg="Customer Details not found";
		}
		return msg;

	}
	@GetMapping("/Autopop")
	public List<Integer> doAutoPop(){
		return customerDAO.getIdList();
	}
}
