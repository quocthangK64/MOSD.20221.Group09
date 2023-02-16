package com.ict.group09.travelwala.ticket.repository;

import com.ict.group09.travelwala.ticket.entity.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
}
