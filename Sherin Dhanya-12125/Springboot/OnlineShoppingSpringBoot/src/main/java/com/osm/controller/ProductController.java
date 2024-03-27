package com.osm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.osm.bean.Product;
import com.osm.dao.CustomerDAO;
import com.osm.dao.ProductDAO;

@RestController
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@PostMapping("InsertProduct")
	public Product insertProduct(@RequestBody Product product) {
		return productDAO.save(product);
	}
	@GetMapping("/ViewAllProduct")
	public List<Product> findAllProduct() {
		return (List<Product>) productDAO.findAll();
 
	}
	
	@GetMapping("/FindProduct/{id}")
	public Product findProduct(@PathVariable Integer id) {
		return productDAO.findById(id).get();
 
	}
	@PutMapping("/UpdateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return productDAO.save(product);
 
	}
	@DeleteMapping("/DeleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") Integer id) {
		String msg = "";
		try {
			productDAO.deleteById(id);
			msg = "Product Details Deleted Successfully";
 
		} catch (Exception e) {
			msg = "Product Details Not Found";
		}
		return msg;
 
	}
	@GetMapping("/ProductAutoPop")
	public List<Integer> productAutoPop(){
		return productDAO.getIdList();
	}
	
	
	
	
	
	
}
