package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springboot.model.Movie;
import com.springboot.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin("http://localhost:3000")
public class MovieController {

	@Autowired
	private MovieRepository repo;

	@GetMapping("GetAllMovies")
	public List<Movie> getAllMovies() {
		return repo.findAll();
	}

	// build create employee REST API
	@PostMapping("InsertMovie")
	public String createMovie(@RequestBody Movie movie) {
		String Msg="";
		try {
				repo.save(movie);
				Msg="Record Updated Successfully";
		}catch (Exception e) {
			Msg="Record not updated";
		}
		return Msg;
	}

	// build get employee by id REST API
	@GetMapping("FindById/{id}")
	public Movie getMovieById(@PathVariable long id) {
		return repo.findById(id).get();
	}

	// build update employee REST API
	@PutMapping("UpdateMovie/{id}")
	public String updateMovie(@PathVariable long id, @RequestBody Movie movieDetails) {
		String Msg="";
		try {
			if(repo.existsById(id)) {
				movieDetails.setId(id);
				repo.save(movieDetails);
				Msg="Record Updated Successfully";
			}
		}catch (Exception e) {
			Msg="Record not updated";
		}
		return Msg;
	}

	// build delete employee REST API
	@DeleteMapping("DeleteMovie/{id}")
	public String deleteMovie(@PathVariable long id) {
		String Msg="";
		try {
			repo.deleteById(id);
			Msg="Record Deleted";
		} catch (Exception e) {
			Msg="Record Not Deleted";
		}
		return Msg;
	}

	@GetMapping("idList")
	public ArrayList<Integer> getAllMoviesList() {
		return repo.getId();
	}
}
