package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Hotel;
import com.hms.repository.HotelRepo;

@RestController
@RequestMapping("/hotel")
@CrossOrigin("http://localhost:3000")
public class HotelController {

	@Autowired
	HotelRepo repo;

	@GetMapping("/getAllHotel")
	public List<Hotel> getAllHotel() {
		return repo.findAll();
	}

	@PostMapping("/addHotel")
	public String addHotel(@RequestBody Hotel h) {
		String msg = "";

		try {
			repo.save(h);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failure";
		}

		return msg;
	}

	@GetMapping("/getHotel")
	public Hotel getHotel(@RequestParam("id") int id) {
		return repo.findById(id).get();
	}

	@PutMapping("/updateHotel")
	public String updateHotel(@RequestBody Hotel h) {
		String msg = "";

		try {
			repo.save(h);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failure";
		}

		return msg;
	}
	
	@DeleteMapping("/deleteHotel")
	public String deleteHotel(@RequestParam("id")int id) {
		String msg = "";

		try {
			repo.deleteById(id);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failure";
		}

		return msg;
		
	}

}
