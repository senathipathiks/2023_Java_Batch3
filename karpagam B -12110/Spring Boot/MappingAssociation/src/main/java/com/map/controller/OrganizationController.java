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

import com.map.bean.Organization;
import com.map.repository.OrganizationRepository;

@RestController
@CrossOrigin("*")
public class OrganizationController {
	
	@Autowired
	private OrganizationRepository orgRepo;
	
	//to insert the data
	@PostMapping("/OrgInsert")
	Organization newOrganization(@RequestBody Organization newOrganization ) {
		return orgRepo.save(newOrganization);
	}
	
	//get all Organization details
	@GetMapping("/getAllOrg")

	List<Organization> getAllOrganization() {
		return (List<Organization>) orgRepo.findAll();
	}	
	
	//delete
	@DeleteMapping("/doOrganizationDelete/{id}")
	public String DeleteOrganization(@PathVariable("id") int id) {
		String msg = "";
		try {
			orgRepo.deleteById(id);
			msg = "Organization Data Deleted";
		} catch (Exception e) {
			msg = "Organization Data not Deleted";
		}
		return msg;
	}
	//get by id
	@GetMapping("/GetOrgId/{id}")
	public Optional<Organization> doOrgFind(@PathVariable("id") int id) {
	   return orgRepo.findById(id);
	}

	//update
		@PutMapping("/doOrgUpdate")
		Organization updateOrganization(@RequestBody Organization org) {

			return orgRepo.save(org);
		}

    //to get all the Id  
    @GetMapping("/getOrgIdList")
		List<Integer> getDeptbylist() {
			List<Integer> idlist = orgRepo.getAllOrgId();
			return idlist;
			}

}
