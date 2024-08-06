package com.tms.service;

import java.util.List;

import com.tms.bean.Admin;

public interface AdminService {

	public Admin newAdmin(Admin newAdmin);

	public List<Admin> getAdmins();

	public Admin adminfind(int adminId);

	public List<Integer> getAdminIdList();

	public Admin updateAdmin(Admin admin);

	public Admin adminLogin(String userName, String userPassword);

}
