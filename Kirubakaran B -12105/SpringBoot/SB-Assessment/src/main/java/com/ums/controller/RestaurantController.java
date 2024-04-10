package com.ums.controller;
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
import com.ums.model.Restaurant;
import com.ums.repository.RestaurantRepo;

@RestController
@CrossOrigin("http://localhost:3000/")
public class RestaurantController {

	@Autowired
	RestaurantRepo repo;

	@PostMapping("/restins")
	public String doInsert(@RequestBody Restaurant rest) {

		String msg = "";
		try {
			repo.save(rest);
			msg = "Object inserted";
		} catch (Exception e) {
			msg = "Object not inserted";
		}
		return msg;
	}

	@DeleteMapping("/restdel/{resId}")
	public String doDelete(@PathVariable int resId) {

		String msg = "";
		try {
			repo.deleteById(resId);
			msg = "Object deleted";
		} catch (Exception e) {
			msg = "Object not deleted";
		}
		return msg;
	}

	@PutMapping("/restupd")
	public String doUpdate(@RequestBody Restaurant rest) {

		String msg = "";
		try {
			repo.save(rest);
			msg = "Object updated";
		} catch (Exception e) {
			msg = "Object not updated";
		}
		return msg;
	}

	@GetMapping("/restfind/{resId}")
	public Restaurant doFind(@PathVariable int resId) {
		return repo.findById(resId).get();
	}

	@GetMapping("/restfindall")
	public List<Restaurant> getAll() {
		List<Restaurant> list = repo.findAll();
		return list;
	}

}
