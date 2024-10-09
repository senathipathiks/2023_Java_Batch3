package com.crimemgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crimemgt.entity.Criminal;
import com.crimemgt.service.CriminalService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class CriminalController {

	@Autowired
	private CriminalService criminalSerive;
	
	@PostMapping("/addCriminal/{complaintId}/{winId}")
	public Criminal addCriminal(@RequestBody Criminal criminal,@PathVariable("complaintId")int complaintId,@PathVariable("winId")int winId) {
		System.out.println(criminal);
		System.out.println(winId);
		System.out.println(complaintId);
		return criminalSerive.addCriminal(criminal,complaintId,winId);

	}
	
	@GetMapping("/getCriminal")
	public List<Criminal> getAllcriminals() {
		return criminalSerive.getAllCriminals();
	}
	
	@GetMapping("/searchBycriminalId/{criminalId}")
	public List<Criminal> searchCriminalById(@PathVariable("criminalId") int criminalId) {
		return criminalSerive.getBycriminalId(criminalId);
	}

}
