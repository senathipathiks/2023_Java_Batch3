package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Car;

import com.example.repository.CarRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class CarController {
	
	@Autowired
	CarRepository repo;

	@PostMapping("/Create")
	public String addStudent(@RequestBody Car c) {

		String msg = "";
		try {
			repo.save(c);
			msg = "Object Saved";
		} catch (Exception e) {
			msg = "Object Saved";
		}
		return msg;
	}

	@PutMapping("/UpdateCar")
	public String updateCar(@RequestBody Car c) {

		String msg = " ";
		try {
			repo.save(c);
			msg = "Employee Object Saved";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Employee Object Not Saved";
		}
		return msg;

	}

	@GetMapping("GetAllCarDetails")
	List<Car> getAllCarDetails() {

		List<Car> ls = repo.findAll();
		return ls;

	}

	@GetMapping("/FindById/{id}")
	Car findById(@PathVariable("id") int id) {
		Car ls = repo.findById(id).get();
		return ls;

	}

	@GetMapping("/GetIdList")
	List<Integer> getIdList(@RequestBody Car c) {

		List<Integer> ls = repo.getIdList();
		return ls;

	}

}
