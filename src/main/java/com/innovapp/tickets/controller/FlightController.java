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

import com.innovapp.tickets.exception.ResourceNotFoundException;
import com.innovapp.tickets.model.Flight;
import com.innovapp.tickets.model.Passenger;
import com.innovapp.tickets.repository.FlightRepository;
import com.innovapp.tickets.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	private FlightService service;
	
	@GetMapping("/flight")
	public List<Flight> findAll(){
		return service.findAll();
	}
	
	
	@GetMapping("/flight/{id}")
	public Object findById(@PathVariable Integer id){
		return service.findByd(id);
	}
	
	@PostMapping("/flight")
	public Flight save(@Valid @RequestBody Flight flight){
		return service.save(flight);
	}
	
	@PutMapping("/flight")
	public Flight update(@PathVariable Integer id, @Valid @RequestBody Flight flightRequest){
		return service.update(id, flightRequest);
	}
	
}
