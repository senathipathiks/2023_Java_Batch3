package com.oss.controller;

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

import com.oss.model.Administration;
import com.oss.repository.AdminRepository;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin("http://localhost:3000")

public class AdminController {

	@Autowired
	AdminRepository repo;

	@GetMapping("GetAdmin")
	public List<Administration> loadAll() {
		List<Administration> adList = (List<Administration>) repo.findAll();
		return adList;
	}

	@GetMapping("/GetAdminById/{adminId}")
	public Optional<Administration> getById(@PathVariable int adminId) {
		return repo.findById(adminId);
	}
	
	@GetMapping("AdminById")
	public List<Integer> doById() {
		List<Integer> list = repo.getIdList();
		return list;
	}

	@PostMapping("CreateAdmin")
	public String performInsert(@RequestBody Administration admin) {
		String msg;
		try {
			repo.save(admin);
			msg = "Data Saved Successfully";
		} catch (Exception e) {
			msg = "Data Failed to Insert";
		}
		return msg;

	}

	@PutMapping("UpdateAdmin/{adminId}")
	public Optional<Object> performUpdate(@RequestBody Administration admin, @PathVariable int adminId) {
		return repo.findById(adminId).map(adm -> {

			adm.setAdminName(admin.getAdminName());
			adm.setAdminPhnNo(admin.getAdminPhnNo());
			adm.setAdminAddress(admin.getAdminAddress());
			return repo.save(adm);
		});

	}

	@DeleteMapping("DeleteAdmin/{adminId}")
	public String performDelete(@PathVariable("adminId") int adminId) {
		String msg;
		try {
			repo.deleteById(adminId);
			msg = "Data Deleted Succesfully";
		} catch (Exception e) {
			msg = "Data Failed to Delete";
		}
		return msg;
	}

}
