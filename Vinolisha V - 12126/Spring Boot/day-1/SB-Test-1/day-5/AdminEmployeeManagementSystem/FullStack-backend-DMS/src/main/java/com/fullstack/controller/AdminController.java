package com.fullstack.controller;

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
import com.fullstack.model.Admin;
import com.fullstack.repository.AdminRepository;

@RestController
@CrossOrigin("http://localhost:3001")
@RequestMapping("ams/db")
public class AdminController {

	@Autowired
	AdminRepository adminrepo;

	@PostMapping("/insertAdmin")
	public String insertAdmin(@RequestBody Admin newadmin) {
		String Msg = "";
		try {
			adminrepo.save(newadmin);
			Msg = "Admine Record Saved";

		} catch (Exception e) {
			Msg = "Admin Record Not Saved";
		}
		return Msg;

	}

	@GetMapping("/getAllAdmin")
	public List<Admin> getAllDept() {
		return adminrepo.findAll();

	}

	@GetMapping("/getAdminById/{id}")
	public Admin performFind(@PathVariable Integer id) {
		return adminrepo.findById(id).get();

	}

	@PutMapping("/updateAdmin/{id}")
	public String updateDept(@RequestBody Admin newadmin, @PathVariable Integer id) {
		String Msg = "";
		try {
			if (adminrepo.existsById(id)) {
				newadmin.setId(id);
				adminrepo.save(newadmin);
				Msg = "Admin updated Successfully";
			}

		} catch (Exception e) {
			System.out.println(e);
			Msg = "Admin updation Failed";
		}

		return Msg;
	}

	@PutMapping("/updateAdmin")
	public Admin updateDepart(@RequestBody Admin newadmin) {
		return adminrepo.save(newadmin);

	}

	@DeleteMapping("/deleteAdmin/{id}")
	public String deleteadmin(@PathVariable Integer id) {
		String msg = " ";
		try {
			adminrepo.deleteById(id);
			msg = "Admin Details Deleted Successfully";
		} catch (Exception e) {
			msg = "Admin Details not found";
		}
		return msg;

	}

	@GetMapping("/AutopopIdList")
	public List<Integer> doAutoPop() {
		return adminrepo.getIdList();
	}

}
