package com.springboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Brand;
import com.springboot.bean.Inventory;
import com.springboot.repo.BrandRepo;


@RestController
@CrossOrigin("*")
public class BrandController {

	
	@Autowired
	BrandRepo repo;

	@PostMapping("CreateBrand")
	public String createBrand(@RequestBody Brand brand) {
		String msg="";
		try {
			repo.save(brand);
			msg="Inserted Successfully";
		} catch (Exception e) {
			msg="Failed to Insert";
		}
		return msg;
	}
	
	
	@GetMapping("GetAllBrand")
	public ArrayList<Brand> getAllBrand(){
		return (ArrayList<Brand>) repo.findAll();
	}

	@DeleteMapping("DeleteBrand/{bid}")
	public String doDelete(@PathVariable("bid")int bid) {
		String Msg="";
		try {
			repo.deleteById(bid);
			Msg="Record Deleted";
		} catch (Exception e) {
			Msg="Record Not Deleted";
		}
		return Msg;	
	}
	
	@PutMapping("/UpdateBrand/{bid}")
	public String doupdate(@PathVariable int bid ,@RequestBody Brand brand) {
		String Msg="";
		try {	
			if (repo.existsById(bid)) {
				brand.setBid(bid);
				repo.save(brand);
				Msg="Record updated Successfully";
			}
			
		} catch (Exception e) {
			Msg="Record updation Failed";
		}
		
		return Msg;
	}
	
	@GetMapping("GetBrandById/{bid}")
	public Brand findBrandById(@PathVariable("bid")int bid) {
		return repo.findById(bid).get();	
	}
	
	@GetMapping("BrandIdList")
	public ArrayList<Integer> getIdList(){
		return repo.getId();
	}
}

