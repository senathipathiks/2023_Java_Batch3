package com.ims.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ims.entity.Product;
import com.ims.repository.ProductRepo;

@RestController
@CrossOrigin("http://localhost:3030")
public class ProductController {

	@Autowired
	ProductRepo repo;

	@PostMapping("/createproduct")
	public String createProduct(@RequestBody Product p) {
		String msg = "";

		try {
			repo.saveAndFlush(p);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}

	@GetMapping("/readallproduct")
	public List<Product> readAllProduct() {
		return repo.getAllProduct();
	}

	@GetMapping("/readproduct")
	public Product readProduct(@RequestParam("id") int id) {
		return repo.findById(id).get();
	}

	@PutMapping("/updateproduct")
	public String updateProduct(@RequestBody Product p) {
		String msg = "";

		try {
			repo.saveAndFlush(p);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}
	
	@DeleteMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("id") int id) {
		String msg = "";

		try {
			repo.deleteById(id);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}

}
