package com.elbs.controller;

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
import com.elbs.model.Bill;
import com.elbs.repository.BillRepo;
import com.elbs.service.TariffService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class BillController {
	
	
	@Autowired
	BillRepo brepo;
	
	@PostMapping("/Billinsert")
	public String getInsert(@RequestBody Bill bill) {

		String msg = "";
		try {
			brepo.save(bill);
			msg = "Object inserted";
		} catch (Exception e) {
			msg = "Object not inserted";
		}
		return msg;
	}

	@GetMapping("/Billfindall")
	public List<Bill> getAll() {
		List<Bill> list = brepo.findAll();
		return list;
	}

	@DeleteMapping("/Billdelete/{billId}")
	public String getDelete(@PathVariable int billId) {

		String msg = "";
		try {
			brepo.deleteById(billId);
			msg = "Object deleted";
		} catch (Exception e) {
			msg = "Object not deleted";
		}
		return msg;
	}

	@PutMapping("/Billupdate")
	public String getUpdate(@RequestBody Bill bill) {

		String msg = "";
		try {
			brepo.save(bill);
			msg = "Object updated";
		} catch (Exception e) {
			msg = "Object not updated";
		}
		return msg;
	}

//	@GetMapping("/Departmentfind/{departmentId}")
//	public Bill getFind(@PathVariable int departmentId) {
//		return brepo.findById(billId).get();
//	}

}
