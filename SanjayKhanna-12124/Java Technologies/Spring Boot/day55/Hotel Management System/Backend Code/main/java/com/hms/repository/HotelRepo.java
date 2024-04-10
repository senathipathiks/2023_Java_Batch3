package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {

}
