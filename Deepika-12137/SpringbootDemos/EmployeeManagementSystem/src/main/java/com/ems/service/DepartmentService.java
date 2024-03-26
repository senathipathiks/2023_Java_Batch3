package com.ems.service;

import org.springframework.security.core.userdetails.UserDetailsService;





public interface DepartmentService extends DepartmentDetailsService{
	DepartmentService save(DepartmentDto registrationDto);
}
