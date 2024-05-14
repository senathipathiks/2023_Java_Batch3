package com.sbmobilerepairapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sbmobilerepairapp.entity.Appointment;

@Repository
@Transactional
public class AppointmentDAO {

	private AppointmentRepo repo;

	public AppointmentDAO() {
		super();
	}

	@Autowired
	public AppointmentDAO(AppointmentRepo repo) {
		super();
		this.repo = repo;
	}
	
	public boolean saveAppointment(Appointment appointment) {
		
		try {
			if (appointment != null) {
				repo.saveAndFlush(appointment);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
