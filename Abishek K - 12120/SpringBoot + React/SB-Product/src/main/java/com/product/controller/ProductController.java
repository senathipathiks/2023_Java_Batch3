package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.bean.Product;
import com.product.repo.ProductRepo;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductRepo repo;
	
	@PostMapping("/insertProduct")
	public String insertProduct(@RequestBody Product prd ) {
		
		String msg;
		try {
			repo.save(prd);
			msg = "Insertion is Successfull";
		}
		catch(Exception e) {
			msg = "Insertion is Failure";
		}
		return msg;
	}
	
	@GetMapping("/pIdList")
	public List<Integer> getIdList(){
		List<Integer> idList = repo.getIdList();
		return idList;
	}
	
	@GetMapping("/pNameList")
	public List<String> getNameList(){
		List<String> nameList = repo.getNameList();
		return nameList;
		
	}
	
	@GetMapping("/findId/{pId}")
	public Product findById(@PathVariable("pId")int pId) {
		Product prd =  repo.findById(pId).get();
		return prd;
	}
	
	@GetMapping("/findName/{pName}")
	public List<Product> findByName(@PathVariable("pName")String pName){
		
		List<Product> pList = repo.findBypName(pName);
		return pList;
		
	}
	
	@PutMapping("/updateProduct")
	public String updateProduct(@RequestBody Product prd) {
		String msg;
		try {
		repo.save(prd);
		msg = "Updation Successfull";
		}
		catch(Exception e) {
			msg = "Updation failure";
		}
		return msg;
		
	}
	
	@DeleteMapping("/deleteId/{pId}")
	public String deleteId(@PathVariable("pId")int pId) {
		String msg;
		try {
		repo.deleteById(pId);
		msg = "Deletion Successfull";
		}
		catch(Exception e) {
			msg = "Deletion Failure";
		}
		return msg;
	}
	
	@DeleteMapping("deleteName/{pName}")
	public String deleteByName(@PathVariable("pName")String pName) {
		String msg;
		try {
			repo.deleteBypName(pName);
			msg = "Deletion Successfull";
		}
		catch(Exception e) {
			msg = "Deletion Failure";
		}
		return msg;
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getProduct(){
		List<Product> pList =  (List<Product>) repo.findAll();
		return pList;
	}
	

	
	
}
