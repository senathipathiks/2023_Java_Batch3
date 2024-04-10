package com.rrs.controller;

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

import com.rrs.bean.Train;
import com.rrs.repository.TrainRepository;


@RestController
@CrossOrigin("http://localhost:3000/")
public class TrainController {
	
	@Autowired
	TrainRepository repo;

	@PostMapping("/AddTrain")
	public String addTrain(@RequestBody Train train) {
		String msg = "";
		try {
			repo.save(train);
			msg = "Train Object Saved";
		} catch (Exception e) {
			msg = "Train Object Not Saved";
		}
		return msg;
	}

	@PutMapping("/UpdateTrain")
	public String updateTrain(@RequestBody Train train) {
		String msg = "";
		try {
			repo.save(train);
			msg = "Train Object Updated";
		} catch (Exception e) {
			msg = "Train Object Not Updated";
		}
		return msg;
	}

	@DeleteMapping("/DeleteTrain/{trainId}")
	public String deleteTrain(@PathVariable("trainId") int trainId) {
		String msg = "";
		try {
			repo.deleteById(trainId);
			msg = "Train Object Deleted";
		} catch (Exception e) {
			msg = "Train Object Not Deleted";
		}
		return msg;
	}

	@GetMapping("/GetTrain/{trainId}")
	public Optional<Train> performFind(@PathVariable("trainId") int trainId) {
		return repo.findById(trainId);
	}

	@GetMapping("/GetAllTrain")
	List<Train> getAllAdmin() {
		return (List<Train>) repo.findAll();
	}
	
	@GetMapping("/GetTrainIds")
	public List<Integer> getTrainIds(){
		return repo.fetchTrainIds();
	}

}
