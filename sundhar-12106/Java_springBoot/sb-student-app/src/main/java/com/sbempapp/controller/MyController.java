package com.sbempapp.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sbempapp.service.StudentService;

import jakarta.ws.rs.core.MediaType;

@RestController
@CrossOrigin("http://localhost:3000/")
public class MyController {

//	@Autowired
//	private EmailService emailService;

	@Autowired
	private StudentService service;
	
	Logger logger = LoggerFactory.getLogger(MyController.class);

//	@GetMapping("hello")
//	public String sendEmail() {
//		
//		String body = "this mail is from sundhar raj to his friend from java codes";
//		String subject = "Urgent Immediate..!";
//		
//		emailService.sendEmail("jothilingamtpt@gmail.com", subject, body);
//		System.out.println("hello");
//		return "success";
//	}

	@PostMapping(path = "save", consumes = MediaType.MULTIPART_FORM_DATA)
	public String postStudent(@RequestParam("file") MultipartFile file) throws IOException {
//		System.out.println("hello from controller : " + file);
		logger.debug("hello from controller");
		return service.saveStudentPicture(file);
	}

	@GetMapping
	public ResponseEntity<byte[]> getByImageId(@RequestParam int id) {

		return service.getImage(id);
	}
	
	@GetMapping("getImage")
	public List<byte[]> getAllImage(){
		
		return service.getAll();
	}

}
