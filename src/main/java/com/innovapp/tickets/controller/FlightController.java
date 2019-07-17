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

@RestController
public class FlightController {

	@Autowired
	private FlightRepository repository;
	
	@GetMapping("/flight")
	public List<Flight> findAll(){
		return repository.findAll();
	}
	
	@PostMapping("/flight")
	public Flight save(@Valid @RequestBody Flight flight){
		return repository.save(flight);
	}
	
	@PutMapping("/flight")
	public Flight update(@PathVariable Integer id, @Valid @RequestBody Flight flightRequest){
		return repository.findById(id).map(flight -> {
			flight.setDescription(flightRequest.getDescription());
			flight.setDepartureDate(flightRequest.getDepartureDate());
			flight.setOriginCity(flightRequest.getOriginCity());
			flight.setDestinationCity(flightRequest.getDestinationCity());
			return repository.save(flight);
		}).orElseThrow(() -> new ResourceNotFoundException("No se encontro el vuelo con el id " + id ));
	}
	
}
