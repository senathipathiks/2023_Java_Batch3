package com.elbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elbs.model.Tariff;

@Repository
public interface TariffRepo extends JpaRepository<Tariff, Integer>{

	


}
