package com.employeeApplication.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.employeeApplication.dao.EmployeeDAO;
import com.employeeApplication.dto.Employee;
import com.employeeApplication.util.ResponseStructure;

@Service
public class EmployeeService {

	private final EmployeeDAO dao;
	private JavaMailSender mailSender;

	public EmployeeService(EmployeeDAO dao, JavaMailSender mailSender) {
		super();
		this.dao = dao;
		this.mailSender = mailSender;
	}

	public void sendEmail(String toMail, String subject, String body) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("sundharrajs.m.s422@gmail.com");
		message.setTo(toMail);
		message.setText(body);
		message.setSubject(subject);

		mailSender.send(message);

	}

	public ResponseStructure<List<Integer>> getIdList() {

		ResponseStructure<List<Integer>> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("data fetched successfully..!");
		rs.setData(dao.fetchAllEmployeeID());
		return rs;

	}

	public ResponseStructure<Employee> saveEmployee(Employee employee) {

		ResponseStructure<Employee> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.CREATED.value());
		rs.setMessage("data saved successfully..!");
		rs.setData(dao.save(employee));

		return rs;

	}

	public ResponseStructure<Employee> fetchEmployee(int id) {

		ResponseStructure<Employee> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Data fetched Successfully...!");
		rs.setData(dao.fetch(id));

		return rs;

	}

	public ResponseStructure<List<Employee>> fetchAllEmployee() {

		ResponseStructure<List<Employee>> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Data fetched Successfully...!");
		rs.setData(dao.fetchAll());
		return rs;

	}

	// update Employee
	public ResponseStructure<Employee> updateEmployee(Employee employee) {

		ResponseStructure<Employee> rs = new ResponseStructure<>();

		if (employee != null) {
			Employee employee1 = dao.fetch(employee.getId());

			employee1.setName(employee.getName());
			employee1.setEmail(employee.getEmail());
			employee1.setSalary(employee.getSalary());
			rs.setStatusCode(HttpStatus.CREATED.value());
			rs.setMessage("data updated successfully..!");
			rs.setData(dao.save(employee1));

		} else {
			rs.setStatusCode(HttpStatus.CONFLICT.value());
			rs.setMessage("data not updated..!");
			rs.setData(null);
		}

		return rs;

	}

	// delete employee
	public ResponseStructure<String> deleteEmployeeById(int id) {

		ResponseStructure<String> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setMessage("Employee record deleted successfully...!");
		rs.setData(dao.deleteById(id));
		return rs;
	}

	// fetch employee by name
	public ResponseStructure<List<Employee>> fetchByName(String name) {

		ResponseStructure<List<Employee>> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("data fetched successfully...!");
		rs.setData(dao.fetchByName(name));
		return rs;
	}

	// calling name like operations
	public ResponseStructure<List<Employee>> searchEmployee(String name) {

		ResponseStructure<List<Employee>> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Employee record found from database");
		rs.setData(dao.fetchLikeEmployees(name));
		return rs;
	}

	// calling get all employees names method
	public ResponseStructure<List<String>> getAllNames() {
		ResponseStructure<List<String>> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Employee record found from database");
		rs.setData(dao.getNames());
		return rs;
	}

	// calling delete By name
	public ResponseStructure<String> deleteByName(String name) {

		ResponseStructure<String> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setMessage("data deleted successfully...!");
		rs.setData(dao.deleteByName(name));
		return rs;
	}
}
