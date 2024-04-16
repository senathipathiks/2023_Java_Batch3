package com.prac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.prac.bean.Document;
import com.prac.repo.DocRepo;


@Service
public class DocStorageService {

	@Autowired
	private  DocRepo repo;
	
	public  void saveFile(Document document)
	{
		repo.save(document);
	}
	
	public Optional<Document> getFileId(int id){
		Optional<Document> docList = repo.findById(id);
		return docList;
	}
	
	public List<Document> getAllFiles(){
		List<Document> docList = repo.findAll();
		return docList;
	}
}
