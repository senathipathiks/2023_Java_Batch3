package com.crimemgt.service;

import java.util.List;

import com.crimemgt.entity.Complaint;

public interface ComplaintService {

	public Complaint addComplaint(Complaint complaint);

	public boolean updateComplaint(int complaintId);

	public boolean withdrawComplaint(int complaintId);

	public List<Complaint> getAllcomplaints();

	public List<Complaint> getpendingcomplaints(int stationId);

	public List<Complaint> getsolvedcomplaints(int stationId);

	public List<Complaint> getrejectedcomplaints(int stationId);

	public List<Complaint> getHighPrioritycomplaints();

	public List<Complaint> getMediumPrioritycomplaints();

	public List<Complaint> getLowPrioritycomplaints();

	public Complaint getByComplaintId(int complaintId);

	public List<Complaint> findpriority(String priority);

	public List<Complaint> findUsercomplaintbyId(int stationId);

	public Object pendingCount(int stationId);

	public Object solvedCount(int stationId);

	public Object withdrawCount(int stationId);
	

	

}
