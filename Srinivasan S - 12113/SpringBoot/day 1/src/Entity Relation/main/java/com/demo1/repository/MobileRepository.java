package com.demo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo1.model.Mobile;

import jakarta.transaction.Transactional;


@Transactional
public interface MobileRepository extends JpaRepository<Mobile, Integer> {

	Mobile findByMobileId(int mobileId);
	
	List<Mobile> findByBrandContaining(String brand);

}
