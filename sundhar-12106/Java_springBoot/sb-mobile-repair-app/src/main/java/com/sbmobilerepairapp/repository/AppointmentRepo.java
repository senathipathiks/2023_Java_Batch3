package com.sbmobilerepairapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbmobilerepairapp.entity.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{

}
