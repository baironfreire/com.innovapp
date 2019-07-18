package com.innovapp.tickets.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovapp.tickets.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

	
}
