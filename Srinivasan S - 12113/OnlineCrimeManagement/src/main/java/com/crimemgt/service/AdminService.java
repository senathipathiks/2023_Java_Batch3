package com.crimemgt.service;

import java.util.List;

import com.crimemgt.dto.AdminDTO;
import com.crimemgt.entity.Admin;

public interface AdminService {

	public List<AdminDTO> getAdmins();

	public Admin adminLogin(String adminName, String adminPassword);

}
