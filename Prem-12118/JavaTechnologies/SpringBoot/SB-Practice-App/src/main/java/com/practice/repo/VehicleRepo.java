package com.practice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.practice.bean.Vehicle;

public interface VehicleRepo extends CrudRepository<Vehicle, Integer> {

    @Query("select v.vId from Vehicle v order by v.vId asc")
    public List<Integer> getIdList();

}
