package com.bms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bms.entity.Payee;
import com.bms.repo.PayeeRepo;

@Service
public class PayeeService {

	private PayeeRepo payeeRepo;

	public PayeeService(PayeeRepo payeeRepo) {
		super();
		this.payeeRepo = payeeRepo;
	}

	public String addPayee(Payee payee) {
		String msg = "";

		try {
			payeeRepo.save(payee);
			msg = "Payee Added Successfully";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failed to add Payee";
		}

		return msg;
	}
	
	public String deletePayee(int payeeId) {
		String msg = "";

		try {
			payeeRepo.deleteById(payeeId);;
			msg = "Payee Deleted Successfully";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failed to delete Payee";
		}

		return msg;
	}
	
	public String updatePayee(Payee payee) {
		String msg = "";

		try {
			payeeRepo.save(payee);
			msg = "Payee updated Successfully";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failed to update Payee";
		}

		return msg;
	}
	
	public List<Payee> getPayeeList(){
		return payeeRepo.findAll();
	}
	
	@SuppressWarnings("deprecation")
	public Payee getPayee(int payeeId) {
		return payeeRepo.getById(payeeId);
	}

}
