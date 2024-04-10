package com.ums.controller;
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
import com.ums.model.Customer;
import com.ums.repository.CustomerRepo;
import com.ums.repository.RestaurantRepo;

@RestController
@CrossOrigin("http://localhost:3000/")
public class CustomerController {

	@Autowired
	CustomerRepo repo;
	
	@Autowired
	RestaurantRepo repo1;

	@PostMapping("/cusins")
	public String doInsert(@RequestBody Customer Cust) {

		String msg = "";
		try {
			repo.save(Cust);
			msg = "Object inserted";
		} catch (Exception e) {
			msg = "Object not inserted";
		}
		return msg;
	}

	@DeleteMapping("/cusdel/{customerId}")
	public String doDelete(@PathVariable int customerId) {

		String msg = "";
		try {
			repo.deleteById(customerId);
			msg = "Object deleted";
		} catch (Exception e) {
			msg = "Object not deleted";
		}
		return msg;
	}

	@PutMapping("/cusupd")
	public String doUpdate(@RequestBody Customer cust) {

		String msg = "";
		try {
			repo.save(cust);
			msg = "Object updated";
		} catch (Exception e) {
			msg = "Object not updated";
		}
		return msg;
	}

	@GetMapping("/cusfind/{customerId}")
	public Customer doFind(@PathVariable int customerId) {
		return repo.findById(customerId).get();
	}

	@GetMapping("/cusfindall")
	public List<Customer> getAll() {
		List<Customer> list = repo.findAll();
		return list;
	}
	
	@GetMapping("/autopopresid")
	public List<Integer> getId() {
		return repo1.getIdList();
	}
}
