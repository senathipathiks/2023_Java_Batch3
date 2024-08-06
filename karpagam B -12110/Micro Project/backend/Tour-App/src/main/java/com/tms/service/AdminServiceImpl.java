package com.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tms.bean.Admin;
import com.tms.repository.AdminDao;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao admindao;

	@Override
	public Admin newAdmin(Admin newAdmin) {
		return admindao.newAdmin(newAdmin);
	}

	@Override
	public List<Admin> getAdmins() {

		return admindao.getAdmins();

	}

	@Override
	public Admin adminfind(int adminId) {
		return admindao.adminfind(adminId);
	}

	@Override
	public List<Integer> getAdminIdList() {
		return admindao.getAdminIdList();
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return admindao.updateAdmin(admin);
	}

	@Override
	public Admin adminLogin(String userName, String userPassword) {
		return admindao.adminLogin(userName, userPassword);
	}

}
