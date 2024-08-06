package com.tms.repository;

import java.util.List;

import com.tms.bean.Admin;

public interface AdminDao {

	public Admin newAdmin(Admin newAdmin);

	public List<Admin> getAdmins();

	public Admin adminfind(int adminId);

	public List<Integer> getAdminIdList();

	public Admin updateAdmin(Admin admin);

	public Admin adminLogin(String userName, String userPassword);

}
