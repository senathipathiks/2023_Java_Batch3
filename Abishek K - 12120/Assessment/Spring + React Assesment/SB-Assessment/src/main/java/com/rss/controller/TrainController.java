package com.rss.controller;

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

import com.rss.bean.Train;
import com.rss.repo.TrainRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api")
public class TrainController {
	
	@Autowired
	TrainRepo repo;
	
	@PostMapping("/insertTrain")
	public String doInsert(@RequestBody Train tr) {
		String msg="";
		try {
			repo.save(tr);
			msg="Insertion successfull";
		}catch(Exception e) {
			msg="Insertion Failure";
		}
		return msg;
	}
	
	@PutMapping("/updateTrain")
	public String doUpdate(@RequestBody Train tr) {
		String msg="";
		try {
			repo.save(tr);
			msg="Updation successfull";
		}catch(Exception e) {
			msg="Updation Failure";
		}
		return msg;
	}
	
	@GetMapping("/findTrainId/{trId}")
	public Train doFindId(@PathVariable("trId")int trId) {
		Train tr = repo.findById(trId).get();
		return tr;
	}
	
	@GetMapping("/findTrainName/{trName}")
	public List<Train> doFindId(@PathVariable("trName")String trName) {
		List<Train> trlist = repo.findByTrName(trName);
		return trlist;
	}
	
	@DeleteMapping("/deleteTrainId/{trId}")
	public String doDeleteId(@PathVariable("trId")int trId) {
		String msg="";
		try {
			repo.deleteById(trId);
			msg="Deletion successfull";
		}catch(Exception e) {
			msg="Deletion Failure";
		}
		return msg;
	}
	
	@DeleteMapping("/deleteTrainName/{trName}")
	public String doDeleteId(@PathVariable("trName")String trName) {
		String msg="";
		try {
			repo.deleteByTrName(trName);
			msg="Deletion successfull";
		}catch(Exception e) {
			msg="Deletion Failure";
		}
		return msg;
	}
	
	@GetMapping("/findallTrain")
	public List<Train> doFindAll(){
		List<Train> trList = (List<Train>) repo.findAll();
		return trList;
	}

}
