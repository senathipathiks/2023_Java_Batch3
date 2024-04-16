package com.map.controller;

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

import com.map.bean.Project;
import com.map.repository.ProjectRepository;

@RestController
@CrossOrigin("*")
public class ProjectController {
	
	@Autowired
	private ProjectRepository prorepo;
	
	//to insert the data
		@PostMapping("/ProInsert")
		Project newProject(@RequestBody Project newProject ) {
			return prorepo.save(newProject);
		}
		
		//get all Project details
		@GetMapping("/getAllProject")

		List<Project> getAllProject() {
			return (List<Project>) prorepo.findAll();
		}	
		
		//delete
		@DeleteMapping("/doProjectDelete/{id}")
		public String DeleteProject(@PathVariable("id") int id) {
			String msg = "";
			try {
				prorepo.deleteById(id);
				msg = "Project Data Deleted";
			} catch (Exception e) {
				msg = "Project Data not Deleted";
			}
			return msg;
		}
		//get by id
		@GetMapping("/GetProjectId/{id}")
		public Optional<Project> doOrgFind(@PathVariable("id") int id) {
		   return prorepo.findById(id);
		}

		//update
			@PutMapping("/doProjectUpdate")
			Project updateProject(@RequestBody Project pro) {

				return prorepo.save(pro);
			}

	    //to get all the Id  
	    @GetMapping("/getProjectIdList")
			List<Integer> getProjectbylist() {
				List<Integer> idlist = prorepo.getAllProjectId();
				return idlist;
				}
	
	

}
