package com.elbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.elbs.model.Tariff;
import com.elbs.repository.TariffRepo;
import com.elbs.service.TariffService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class TariffController {
	
	@Autowired
	TariffService service;
	
	@Autowired
	TariffRepo trepo;
	
	@PostMapping("/Tariffinsert")
	public String getInsert(@RequestBody Tariff tariff) {

		String msg = "";
		try {
			trepo.save(tariff);
			msg = "Object inserted";
		} catch (Exception e) {
			msg = "Object not inserted";
		}
		return msg;
	}

	@GetMapping("/Tarifffindall")
	public List<Tariff> getAll() {
		List<Tariff> list = trepo.findAll();
		return list;
	}

	@DeleteMapping("/Tariffdelete/{tariffId}")
	public String getDelete(@PathVariable int tariffId) {

		String msg = "";
		try {
			trepo.deleteById(tariffId);
			msg = "Object deleted";
		} catch (Exception e) {
			msg = "Object not deleted";
		}
		return msg;
	}

	@PutMapping("/Tariffupdate")
	public String getUpdate(@RequestBody Tariff tariff) {

		String msg = "";
		try {
			trepo.save(tariff);
			msg = "Object updated";
		} catch (Exception e) {
			msg = "Object not updated";
		}
		return msg;
	}

//	@GetMapping("/Departmentfind/{departmentId}")
//	public Bill getFind(@PathVariable int departmentId) {
//		return brepo.findById(billId).get();
//	}

}
