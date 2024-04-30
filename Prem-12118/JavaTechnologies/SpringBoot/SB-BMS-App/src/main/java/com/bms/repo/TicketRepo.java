package com.bms.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.bms.bean.Ticket;

import java.util.List;

public interface TicketRepo extends CrudRepository<Ticket, Integer> {
    
    @Query("SELECT ticketId FROM Ticket ORDER BY ticketId")
    List<Integer> getIdList();
}
