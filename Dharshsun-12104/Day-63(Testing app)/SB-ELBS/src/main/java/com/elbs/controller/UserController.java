package com.elbs.controller;

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
import com.elbs.model.Bill;
import com.elbs.model.Tariff;
import com.elbs.model.User;
import com.elbs.repository.BillRepo;
import com.elbs.repository.TariffRepo;
import com.elbs.repository.UserRepo;
@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {
	
	
	@Autowired
	BillRepo brepo;
	
	@Autowired
	TariffRepo trepo;
	
	@Autowired
	UserRepo urepo;
	
	@PostMapping("/Userinsert")
	public String getInsert(@RequestBody User user) {

		String msg = "";
		try {
			urepo.save(user);
			msg = "Object inserted";
		} catch (Exception e) {
			msg = "Object not inserted";
		}
		return msg;
	}

	@GetMapping("/Userfindall")
	public List<User> getAll() {
		List<User> list = urepo.findAll();
		return list;
	}

	@DeleteMapping("/Userdelete/{userId}")
	public String getDelete(@PathVariable int userId) {

		String msg = "";
		try {
			urepo.deleteById(userId);
			msg = "Object deleted";
		} catch (Exception e) {
			msg = "Object not deleted";
		}
		return msg;
	}

	@PutMapping("/Userupdate")
	public String getUpdate(@RequestBody User user) {

		String msg = "";
		try {
			urepo.save(user);
			msg = "Object updated";
		} catch (Exception e) {
			msg = "Object not updated";
		}
		return msg;
	}
	@GetMapping("/Autopoptariffid")
	public List<Tariff> gettariffId() {
		return trepo.findAll();
	}
	@GetMapping("/Autopopbillid")
	public List<Bill> getbillId() {
		return brepo.findAll();
	}

}
