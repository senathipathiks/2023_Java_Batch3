package com.bms.controller;

import com.bms.bean.Ticket;
import com.bms.bean.User;
import com.bms.repo.TicketRepo;
import com.bms.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class TicketController {

    @Autowired
    private TicketRepo ticketRepo;

    @PostMapping("/CreateTicket")
    public String insertTicket(@RequestBody Ticket ticket) {
        String msg = "";
        try {
            ticketRepo.save(ticket);
            msg = "Ticket Object Saved";
        } catch (Exception e) {
            msg = "Ticket Object not Saved";
        }
        return msg;
    }

    @PutMapping("/UpdateTicket/{ticketId}")
    public String updateTicket(@RequestBody Ticket ticket) {
        String msg = "";
        try {
            ticketRepo.save(ticket);
            msg = "Ticket Object Updated";
        } catch (Exception e) {
            msg = "Ticket Object not updated";
        }
        return msg;
    }

    @DeleteMapping("/DeleteTicketById/{ticketId}")
    public String deleteTicket(@PathVariable("ticketId") Integer ticketId) {
        String msg = "";
        try {
            ticketRepo.deleteById(ticketId);
            msg = "Ticket Object deleted";
        } catch (Exception e) {
            msg = "Ticket Object not deleted";
        }
        return msg;
    }

    @GetMapping("/GetTicketById/{ticketId}")
    public Optional<Ticket> getTicketById(@PathVariable Integer ticketId) {
        return ticketRepo.findById(ticketId);
    }

    @GetMapping("/GetAllTickets")
    public List<Ticket> findAllTickets() {
        return (List<Ticket>) ticketRepo.findAll();
    }
}
