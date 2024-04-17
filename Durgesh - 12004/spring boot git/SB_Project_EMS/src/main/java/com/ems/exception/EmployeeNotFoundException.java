package com.ems.exception;

public class EmployeeNotFoundException extends RuntimeException{
	public EmployeeNotFoundException(Long id) {
		super("Could not found the employee with id " +id);
	}
}
