package com.crimemgt.service;

import java.util.List;

import com.crimemgt.entity.Criminal;

public interface CriminalService {
	
	public Criminal addCriminal(Criminal criminal,int complaintId,int winId);
	
	public List<Criminal> getAllCriminals();

	public List<Criminal> getBycriminalId(int criminalId);
}
