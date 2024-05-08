package com.bms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.entity.Payee;

@Repository
public interface PayeeRepo extends JpaRepository<Payee, Integer> {

}
