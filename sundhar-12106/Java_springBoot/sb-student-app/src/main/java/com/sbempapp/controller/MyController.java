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

	private StudentService service;

	Logger logger = LoggerFactory.getLogger(MyController.class);

	public MyController() {

	}

	public MyController(StudentService service) {
		super();
		this.service = service;
	}

	@PostMapping(path = "save", consumes = MediaType.MULTIPART_FORM_DATA)
	public String postStudent(@RequestParam("file") MultipartFile file) throws IOException {
		
		logger.debug("hello from controller");
		return service.saveStudentPicture(file);
	}

	@GetMapping
	public ResponseEntity<byte[]> getByImageId(@RequestParam int id) {

		return service.getImage(id);
	}

	@GetMapping("getImage")
	public List<byte[]> getAllImage() {

		return service.getAll();
	}

}
