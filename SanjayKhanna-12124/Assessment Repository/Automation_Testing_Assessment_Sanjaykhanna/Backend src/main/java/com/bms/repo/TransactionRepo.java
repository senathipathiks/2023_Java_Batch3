package com.bms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.entity.Payee;
import com.bms.entity.Transaction;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

	public void deleteByPayee(Payee Payee);
	
}
