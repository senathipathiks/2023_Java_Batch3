package com.crimemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimemgt.dao.CriminalDAO;
import com.crimemgt.entity.Criminal;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CriminalImpl implements CriminalService {
	
	@Autowired
	CriminalDAO criminaldao;

	@Override
	public Criminal addCriminal(Criminal criminal,int complaintId,int winId) {
		return criminaldao.addCriminal(criminal, complaintId, winId);
	}

	@Override
	public List<Criminal> getAllCriminals() {
		return criminaldao.getAllcriminals();
	}

	@Override
	public List<Criminal> getBycriminalId(int criminalId) {
		return criminaldao.searchCriminals(criminalId);
	}

}
