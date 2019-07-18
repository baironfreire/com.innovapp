package com.innovapp.tickets.service.imp;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.innovapp.tickets.exception.ResourceNotFoundException;
import com.innovapp.tickets.model.Flight;
import com.innovapp.tickets.model.Passenger;
import com.innovapp.tickets.model.Ticket;
import com.innovapp.tickets.repository.TicketRepository;
import com.innovapp.tickets.service.TicketServicie;

@Service
@Transactional
public class TicketServiceImpl   implements TicketServicie {
	private static final double IVA = 19;
	private static final double POR = 100;


	@Autowired
	private TicketRepository repository;
	
	
	@Override
	public Ticket save(Ticket ticket) {
		ticket.setDiscountTicket(calculateDiscount(ticket));
		ticket.setTikectIVA(calculateIVA(ticket));
		return repository.save(ticket);
	}
	
	@Override
	public Ticket update(Integer id, Ticket ticketRequest){
		return  (Ticket) repository.findById(id).map(ticket -> {
			ticket.setTicketValue(ticketRequest.getTicketValue());
			ticket.setPassenger(ticketRequest.getPassenger());
			ticket.setAirplane(ticketRequest.getAirplane());
			ticket.setTikectIVA(ticketRequest.getTikectIVA());
			ticket.setFlight(ticketRequest.getFlight());
			
			return save(ticket);
		}).orElseThrow(() -> new ResourceNotFoundException("No se encontro el tiquete con el id " + id ));
	}
	
	
	/**
	 * 
	 * @date 17/07/2019 
	 * @return 
	 * @see com.innovapp.tickets.service.TicketServicie#findAll() 
	 */ 
	@Override
	public List<Ticket> findAll() {
		return repository.findAll();
	}

	/**
	 * 
	 * @date 17/07/2019 
	 * @param id
	 * @return 
	 * @see com.innovapp.tickets.service.TicketServicie#findByd(java.lang.Integer) 
	 */ 
	@Override
	public Object findByd(Integer id) {
		return repository.findById(id);
	}

	/**
	 * 
	 * @date 17/07/2019 
	 * @param id
	 * @return 
	 * @see com.innovapp.tickets.service.TicketServicie#delete(java.lang.Integer) 
	 */ 
	@Override
	public Boolean delete(Integer id) {
		
		return null;
	}
	
	private Double calculateIVA(Ticket ticket){
		Double value = (ticket.getTicketValue() * POR) / IVA;
		return value;
	}
	
	private Double calculateDiscount(Ticket ticket){
		Double discount = ticket.getDiscountTicket();
		Double value = ticket.getTicketValue();
		Double total = value - (discount * value); 
		return total;
	}

	





}
