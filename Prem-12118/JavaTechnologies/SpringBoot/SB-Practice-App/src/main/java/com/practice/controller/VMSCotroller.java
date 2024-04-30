package com.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bean.Vehicle;
import com.practice.repo.VehicleRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class VMSCotroller {

    @Autowired
    private VehicleRepo repo;

    @PostMapping("/create")
    public String insertVehicle(@RequestBody Vehicle vehicle) {
        String msg ="";
        try {
            repo.save(vehicle);
            msg = "Vehicle Object is Inserted";
        } catch (Exception e) {
            msg = "Vehicle Object is Not Inserted ";
        }
        return msg;
    }

    @PutMapping("/update")
    public String updateVehicle(@RequestBody Vehicle vehicle) {
        String msg = null;
        try {
            repo.save(vehicle);
            msg = "Vehicle Object Updated";
        } catch (Exception e) {
            msg = "Vehicle Object Not Updated";
        }
        return msg;
    }

    @DeleteMapping("/delete/{vId}")
    public String deleteVehicleById(@PathVariable("vId") int vId) {
        String msg = "";
        try {
            repo.deleteById(vId);
            msg = "Vehicle Object Deleted";
        } catch (Exception e) {
            msg = "Vehicle Object Not Deleted";
        }
        return msg;
    }

    @GetMapping("/find/{vId}")
    public Optional<Vehicle> getVehicleById(@PathVariable Integer vId) {
        return repo.findById(vId);
    }

    @GetMapping("/findAll")
    public List<Vehicle> getAllVehicles() {
        return (List<Vehicle>) repo.findAll();
    }
}
