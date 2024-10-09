package com.crimemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crimemgt.dao.AdminDAO;
import com.crimemgt.dto.AdminDTO;
import com.crimemgt.entity.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDAO admindao;

	@Override
	public List<AdminDTO> getAdmins() {
		return admindao.allAdmins();
	}

	@Override
	public Admin adminLogin(String adminName, String adminPassword) {
		return admindao.adminLogin(adminName, adminPassword);
	}

}
