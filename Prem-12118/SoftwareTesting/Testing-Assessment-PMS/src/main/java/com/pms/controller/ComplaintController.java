package com.pms.controller;

import com.pms.bean.Complaint;
import com.pms.repo.ComplaintRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintRepo complaintRepo;

    @GetMapping("/all")
    public List<Complaint> getAllComplaints() {
        return complaintRepo.findAll();
    }

    @PostMapping("/register")
    public Complaint registerComplaint(@RequestBody Complaint complaint) {
        complaint.setStatus("Pending");
        return complaintRepo.save(complaint);
    }

    @DeleteMapping("/{id}")
    public void deleteComplaint(@PathVariable Long id) {
        complaintRepo.deleteById(id);
    }

    @PutMapping("/{id}")
    public Complaint updateComplaint(@PathVariable Long id, @RequestBody Complaint updatedComplaint) {
        Optional<Complaint> optionalComplaint = complaintRepo.findById(id);
        if (optionalComplaint.isPresent()) {
            Complaint existingComplaint = optionalComplaint.get();
            existingComplaint.setDescription(updatedComplaint.getDescription());
            return complaintRepo.save(existingComplaint);
        } else {
            throw new RuntimeException("Complaint not found with id: " + id);
        }
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<String> updateComplaintStatus(@PathVariable Long id, @RequestParam String status) {
        Optional<Complaint> optionalComplaint = complaintRepo.findById(id);
        if (optionalComplaint.isPresent()) {
            Complaint complaint = optionalComplaint.get();
            complaint.setStatus(status);
            complaintRepo.save(complaint);
            return ResponseEntity.ok("Complaint status updated successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Complaint not found with id: " + id);
        }
    }
}
