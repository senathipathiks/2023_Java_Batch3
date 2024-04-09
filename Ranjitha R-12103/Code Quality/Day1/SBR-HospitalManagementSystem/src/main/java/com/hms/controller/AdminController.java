package com.hms.controller;

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

import com.hms.bean.Admin;
import com.hms.repository.AdminRepository;

@RestController
@CrossOrigin("*")
public class AdminController {
	@Autowired
	AdminRepository repo;

	@PostMapping("/AddAdmin")
	public String addAdmin(@RequestBody Admin admin) {
		String msg = "";
		try {
			repo.save(admin);
			msg = "Department Object Saved";
		} catch (Exception e) {
			msg = "Department Object Not Saved";
		}
		return msg;
	}

	@PutMapping("/UpdateAdmin")
	public String updateAdmin(@RequestBody Admin admin) {
		String msg = "";
		try {
			repo.save(admin);
			msg = "Admin Object Updated";
		} catch (Exception e) {
			msg = "Admin Object Not Updated";
		}
		return msg;
	}

	@DeleteMapping("/DeleteAdmin/{aid}")
	public String deleteAdmin(@PathVariable("aid") int aid) {
		String msg = "";
		try {
			repo.deleteById(aid);
			msg = "Admin Object Deleted";
		} catch (Exception e) {
			msg = "Admin Object Not Deleted";
		}
		return msg;
	}

	@GetMapping("/GetAdmin/{aid}")
	public Admin performFind(@PathVariable("aid") int aid) {
		return repo.findById(aid).get();
	}

	@GetMapping("/GetAllAdmin")
	List<Admin> getAllAdmin() {
		return (List<Admin>) repo.findAll();
	}
	
	@GetMapping("/GetAdminIds")
	public List<Integer> getAdminIds(){
		return repo.fetchAdminIds();
	}

}
