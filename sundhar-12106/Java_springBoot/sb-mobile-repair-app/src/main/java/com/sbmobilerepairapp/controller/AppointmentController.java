package com.sbmobilerepairapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbmobilerepairapp.entity.Appointment;
import com.sbmobilerepairapp.repository.AppointmentDAO;

@RestController
@RequestMapping("/appointment")
@CrossOrigin("http://localhost:3000/")
public class AppointmentController {

	private AppointmentDAO dao;

	public AppointmentController() {
		super();
	}

	@Autowired
	public AppointmentController(AppointmentDAO dao) {
		super();
		this.dao = dao;
	}

	@PostMapping
	public boolean saveAppointment(@RequestBody Appointment appointment) {

		System.out.println(appointment.getShops());
		return dao.saveAppointment(appointment);

	}

}
