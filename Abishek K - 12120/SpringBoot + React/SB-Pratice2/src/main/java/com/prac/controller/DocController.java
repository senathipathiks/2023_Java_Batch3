package com.prac.controller;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.prac.bean.Document;
import com.prac.repo.DocRepo;
import com.prac.service.DocStorageService;


import jakarta.ws.rs.core.HttpHeaders;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3001/")
public class DocController {
	
	@Autowired
	private DocStorageService serv;
	
	@PostMapping("/uploadFiles")
	public  void uploadFiles(@RequestParam("file")MultipartFile file) throws IOException {

		
		Document doc = new Document();
		doc.setData(Base64.getEncoder().encode(file.getBytes()));
		doc.setDocName(file.getOriginalFilename());
		doc.setDocType(file.getContentType());
		
		serv.saveFile(doc);
		
		
	}
	
	@GetMapping("/downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable("fileId")int id){
		Document docData =  serv.getFileId(id).get();
		byte[] decodeBase = Base64.getDecoder().decode(docData.getData());
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(docData.getDocType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment: filename=\""+docData.getDocName()+"\"")
				.body(new ByteArrayResource(decodeBase));
		
	}
	
	@GetMapping("/getAllFiles")
	public List<Document> downloadAllFile(){
		
		List<Document> docList = serv.getAllFiles();
		return docList;
		
	}
		
}
