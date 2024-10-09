package com.crimemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimemgt.dao.ComplaintDAO;
import com.crimemgt.entity.Complaint;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ComplaintServiceImpl implements ComplaintService {

	@Autowired
	ComplaintDAO complaintdao;

	@Override
	public List<Complaint> getAllcomplaints() {
		return complaintdao.getAllcomplaints();
	}

	@Override
	public Complaint addComplaint(Complaint complaint) {
		return complaintdao.addComplaint(complaint);
	}

	@Override
	public boolean updateComplaint(int complaintId) {
		return complaintdao.updateComplaint(complaintId);
	}

	@Override
	public boolean withdrawComplaint(int complaintId) {
		return complaintdao.rejectComplain(complaintId);
	}

	@Override
	public List<Complaint> getpendingcomplaints(int stationId) {
		return complaintdao.getpendingcomplaints(stationId);
	}

	@Override
	public List<Complaint> getsolvedcomplaints(int stationId) {
		return complaintdao.getsolvedcomplaints(stationId);
	}

	@Override
	public List<Complaint> getrejectedcomplaints(int stationId) {
		return complaintdao.getrejectedcomplaints(stationId);
	}

	@Override
	public List<Complaint> getHighPrioritycomplaints() {

		return complaintdao.highPrioritycomplaints();
	}

	@Override
	public List<Complaint> getMediumPrioritycomplaints() {
		return complaintdao.mediumPrioritycomplaints();
	}

	@Override
	public List<Complaint> getLowPrioritycomplaints() {
		return complaintdao.lessPrioritycomplaints();
	}

	@Override
	public Complaint getByComplaintId(int complaintId) {
		return complaintdao.searchComplaints(complaintId);
	}

	@Override
	public Object pendingCount(int stationId) {
		return complaintdao.pendingCount(stationId);
	}

	@Override
	public List<Complaint> findpriority(String priority) {
		return complaintdao.findpriority(priority);
	}

	@Override
	public Object solvedCount(int stationId) {
		return complaintdao.solvedCount(stationId);
	}

	@Override
	public Object withdrawCount(int stationId) {
		return complaintdao.withdrawnCount(stationId);
	}

	@Override
	public List<Complaint> findUsercomplaintbyId(int stationId) {
		return complaintdao.findusercomplaintbyId(stationId);
	}

}
