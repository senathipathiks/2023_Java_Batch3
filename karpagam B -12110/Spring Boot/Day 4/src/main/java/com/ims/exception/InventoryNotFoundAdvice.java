package com.ims.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

// capture exceptions and translate them to HTTP responses.
@ControllerAdvice
public class InventoryNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(InventoryNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String,String> exceptionHandler(InventoryNotFoundException exception){
		Map<String,String> errorMap = new HashMap<>();
		errorMap.put("errorMessage",exception.getMessage());
		return errorMap;
		
	}

}
