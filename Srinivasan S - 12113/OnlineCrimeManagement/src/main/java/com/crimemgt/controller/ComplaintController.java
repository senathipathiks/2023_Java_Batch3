package com.crimemgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crimemgt.dao.ComplaintDAO;
import com.crimemgt.entity.Complaint;
import com.crimemgt.service.ComplaintService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class ComplaintController {

	@Autowired
	private ComplaintService complaintservice;
	
	@Autowired
	ComplaintDAO dao;

	@PostMapping("/addComplaint")
	public Complaint addComplaint(@RequestBody Complaint complaint) {
		complaint.setStatus("Pending");
		return complaintservice.addComplaint(complaint);
	}

	@PutMapping("/updatecomplaint/{complaintId}")
	public boolean updateComplaint(@PathVariable("complaintId") int complaintId) {
		return complaintservice.updateComplaint(complaintId);
	}

	@PutMapping("/updateReject/{complaintId}")
	public boolean updateRejectComplaint(@PathVariable("complaintId") int complaintId) {
		
		return complaintservice.withdrawComplaint(complaintId);
	}

	@GetMapping("/getComplaints")
	public List<Complaint> getAllcomplaints() {
		return complaintservice.getAllcomplaints();
	}

	@GetMapping("/pendingComplaints/{stationId}")
	public List<Complaint> getPendingcomplaints(@PathVariable("stationId") int stationId) {
		return complaintservice.getpendingcomplaints(stationId);
	}
	
	@GetMapping("/solvedComplaints/{stationId}")
	public List<Complaint> getSolvedcomplaints(@PathVariable("stationId") int stationId) {
		return complaintservice.getsolvedcomplaints(stationId);
	}

	@GetMapping("/rejectedComplaints/{stationId}")
	public List<Complaint> getRejectedcomplaints(@PathVariable("stationId") int stationId) {
		return complaintservice.getrejectedcomplaints(stationId);
	}

	@GetMapping("/highPriorityComplaints")
	public List<Complaint> getHighPriorityComplaints() {
		return complaintservice.getHighPrioritycomplaints();
	}

	@GetMapping("/mediumPriorityComplaints")
	public List<Complaint> getMediumPriorityComplaints() {
		return complaintservice.getMediumPrioritycomplaints();
	}

	@GetMapping("/lowPriorityComplaints")
	public List<Complaint> getLowPriorityComplaints() {
		return complaintservice.getLowPrioritycomplaints();
	}

	@GetMapping("/searchByComplaintId/{complaintId}")
	public Complaint searchcomplaintsById(@PathVariable("complaintId") int complaintId) {
		return complaintservice.getByComplaintId(complaintId);
	}
	

	@GetMapping("/findpriority/{priority}")
	public List<Complaint> findpriority(@PathVariable("priority") String priority) {
		return complaintservice.findpriority(priority);
	}
	
	@GetMapping("/getuserComplaintbyUserId/{userId}")
	public List<Complaint> getuserComplaintbyId(@PathVariable("userId") int userId) {
		return complaintservice.findUsercomplaintbyId(userId);
	}
	
	@GetMapping("/pendingcount/{stationId}")
	public Object pendingCount(@PathVariable("stationId") int stationId) {
		return complaintservice.pendingCount( stationId);
	}
	
	@GetMapping("/solvedcount/{stationId}")
	public Object solvedCount(@PathVariable("stationId") int stationId) {
		return complaintservice.solvedCount( stationId);
	}
	
	@GetMapping("/withdraccount/{stationId}")
	public Object withdrawCount(@PathVariable("stationId") int stationId) {
		return complaintservice.withdrawCount( stationId);
	}
	
	@PostMapping("/sendmail/{complaintId}")
	public boolean send(@PathVariable int complaintId) {
		return dao.updatemailComplaint(complaintId);
	}
	
	
}
