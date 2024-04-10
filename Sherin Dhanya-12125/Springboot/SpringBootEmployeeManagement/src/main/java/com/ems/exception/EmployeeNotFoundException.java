package com.ems.exception;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Integer eid){
        super("Could not found the user with id "+ eid);
    }
}