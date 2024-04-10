package com.ims.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ims.entity.Dealer;
import com.ims.repository.DealerRepo;

@RestController
@CrossOrigin("http://localhost:3030")
public class DealerController {
	
	@Autowired
	DealerRepo repo;
	
	@PostMapping("/createdealer")
	public String createDealer(@RequestBody Dealer d) {
		String msg = "";

		try {
			repo.saveAndFlush(d);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}
	
	@GetMapping("/readalldealer")
	public List<Dealer> readAllDealer(){
		return repo.getAllDealer();
	}
	
	@GetMapping("/readdealer")
	public Dealer readDealer(@RequestParam("id")int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/updatedealer")
	public String updateDealer(@RequestBody Dealer d) {
		String msg = "";

		try {
			repo.saveAndFlush(d);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}
	
	@DeleteMapping("/deletedealer")
	public String deleteDealer(@RequestParam("id")int id) {
		String msg = "";

		try {
			repo.deleteById(id);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}

}
