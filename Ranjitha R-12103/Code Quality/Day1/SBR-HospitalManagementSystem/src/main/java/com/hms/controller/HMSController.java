package com.hms.controller;

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

import com.hms.bean.Hospital;
import com.hms.repository.HospitalRepo;


@RestController
@CrossOrigin("*")
public class HMSController {

	@Autowired
	HospitalRepo  repo;
	
	@PostMapping("/AddPatient")
	public String addPatient(@RequestBody Hospital hospital ) {
		String msg = "";
		try {
			repo.save(hospital);
			msg = "Patient Object Saved";
		} catch (Exception e) {
			msg = "Patient Object Not Saved";
		}
		return msg;
	}
	
	@PutMapping("/UpdatePatient")
	public String updatePatient(@RequestBody Hospital hospital) {
		String msg="";
		try {
			repo.save(hospital);
			msg="Patient Object Updated";
		}catch(Exception e) {
			msg="Patient Object Not Updated";
		}return msg;
	}

	@DeleteMapping("/DeletePatient/{patientId}")
	public String deletePatient(@PathVariable("patientId") int patientId) {
		String msg="";
		try {
			repo.deleteById(patientId);
			msg="Patient Object deleted";
		}catch(Exception e) {
			msg="Patient Object Not Deleted";
		}return msg;
	}
	
	@GetMapping("/Getpatient/{patientId}")
	public Hospital findPatient(@PathVariable("patientId") int patientId) {
		return repo.findById(patientId).get();
	}
	
	@GetMapping("GetAllPatient")
	public List<Hospital> getAllPatient() {
		List<Hospital> patientList = (List<Hospital>) repo.findAll();
		return patientList;
	}
	
	@GetMapping("/GetPatientIds")
	public List<Integer> getPatientIds(){
		return repo.fetchPatientIds();
	}
}
