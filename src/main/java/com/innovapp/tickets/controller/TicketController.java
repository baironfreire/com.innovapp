package com.innovapp.tickets.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.innovapp.tickets.model.Report;
import com.innovapp.tickets.model.Ticket;
import com.innovapp.tickets.service.TicketServicie;

@RestController
public class TicketController {

	
	@Autowired
	private TicketServicie tickeService;
	
	@GetMapping("/ticket")
	public List<Ticket> findAll(){
		return tickeService.findAll();
	}
	
	@GetMapping("/ticket/{id}")
	public Object findById(@PathVariable Integer id){
		return tickeService.findByd(id);
	}
	
	@PostMapping("/ticket")
	public Ticket save(@Valid @RequestBody Ticket ticket){
		return tickeService.save(ticket);
	}
	
	@PutMapping("/ticket")
	public Ticket update(@PathVariable Integer id, @Valid @RequestBody Ticket ticketRequest){
		return tickeService.update(id, ticketRequest);
	}
	
	
}
