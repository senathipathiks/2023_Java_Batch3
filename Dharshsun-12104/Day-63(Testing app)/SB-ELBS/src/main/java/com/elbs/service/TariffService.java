package com.elbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elbs.model.Bill;
import com.elbs.model.Tariff;
import com.elbs.model.User;
import com.elbs.repository.BillRepo;
import com.elbs.repository.TariffRepo;
import com.elbs.repository.UserRepo;

@Service
public class TariffService {

	@Autowired
	TariffRepo trepo;

	@Autowired
	UserRepo urepo;
	
	@Autowired
	BillRepo brepo;
	
	//for tariff

	public boolean doInsertTariff(Tariff tariff) {
		try {
			trepo.save(tariff);
			return true;

		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public Tariff saveTariff(Tariff tariff) {
		return trepo.save(tariff);
	}

	public List<Tariff> getAllTariffs() {
		return trepo.findAll();
	}

	public Optional<Tariff> getTariffById(int id) {
		return trepo.findById(id);
	}

	public boolean doDeleteService(int id) {
		try {
			trepo.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean doUpdateService(Tariff tariff) {
		try {
			trepo.save(tariff);
			return true;

		} catch (Exception e) {

			return false;
		}

	}

	public Tariff findTariffService(int id) {
		Optional<Tariff> tariff = trepo.findById(id);
		if (tariff.isPresent()) {
			return tariff.get();
		} else {
			return null;
		}
	}
	
	//for user

	public boolean doInsertUser(User user) {
		try {
			urepo.save(user);
			return true;

		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean doDeleteUserService(int id) {
		try {
			urepo.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public User findUserService(int id) {
		Optional<User> user = urepo.findById(id);
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}
	
	//for bill
	public boolean doInsertBill(Bill bill) {
		try {
			brepo.save(bill);
			return true;

		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	public boolean doDeleteBillService(int id) {
		try {
			brepo.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Bill findBillService(int id) {
		Optional<Bill> bill = brepo.findById(id);
		if (bill.isPresent()) {
			return bill.get();
		} else {
			return null;
		}
	}
	
}
