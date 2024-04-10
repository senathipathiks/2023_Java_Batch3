package com.bms.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bms.bean.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
	
	@Query("select transactionId FROM Transaction")
	public ArrayList<Integer> getId();

}
