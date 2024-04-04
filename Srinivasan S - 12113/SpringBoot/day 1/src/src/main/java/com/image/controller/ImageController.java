package com.image.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.image.model.Image;
import com.image.repository.ImageRepository;
import com.image.service.ImageService;

@RestController
@CrossOrigin("*")
public class ImageController {
	
	@Autowired
	private ImageService service;
	
	@Autowired	
	private ImageRepository repo;
	
	@PostMapping("/uploadImage")
	public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file)throws IOException{
		String uploadImage=service.uploadImage(file);
		return ResponseEntity.status(HttpStatus.OK)
				.body(uploadImage);
	}
	
	@GetMapping("/downloadImage/{fileName}")
	public ResponseEntity<?> downloadImage(@PathVariable String fileName){
		byte[] imagedw=service.downloadImage(fileName);
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.valueOf("image/png"))
				.body(imagedw);
	}
	
	@GetMapping("/FindAll")	
		public List<Image> findAllImage(){
			return repo.findAll();
		}
	
	
	@GetMapping("getImages")
	public List<byte[]> getAllImages(){
		return service.getAllimages();
	}
	
	

}
