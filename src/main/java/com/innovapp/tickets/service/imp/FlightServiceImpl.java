package com.innovapp.tickets.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.innovapp.tickets.exception.ResourceNotFoundException;
import com.innovapp.tickets.model.Flight;
import com.innovapp.tickets.repository.FlightRepository;
import com.innovapp.tickets.service.FlightService;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository repository;
	
	@Override
	public List<Flight> findAll() {
		return repository.findAll();
	}

	@Override
	public Object findByd(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Flight save(Flight flight) {
		return repository.save(flight);
	}

	@Override
	public Flight update(Integer id, Flight flightRequest) {
		return  repository.findById(id).map(flight -> {
			flight.setDepartureDate(flightRequest.getDepartureDate());
			flight.setDescription(flightRequest.getDescription());
			flight.setDestinationCity(flightRequest.getDestinationCity());
			flight.setOriginCity(flightRequest.getOriginCity());
			
			return save(flight);
		}).orElseThrow(() -> new ResourceNotFoundException("No se encontro el vuelo con el id " + id ));
	}

	@Override
	public Boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
