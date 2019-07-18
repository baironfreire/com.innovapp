package com.innovapp.tickets.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.innovapp.tickets.exception.ResourceNotFoundException;
import com.innovapp.tickets.model.Passenger;
import com.innovapp.tickets.model.Ticket;
import com.innovapp.tickets.repository.PassengerRepository;
import com.innovapp.tickets.service.PassengerService;

@Service
@Transactional
public class PassengerServiceImp implements PassengerService {

	@Autowired
	private PassengerRepository repository;
	
	@Override
	public List<Passenger> findAll() {
		return repository.findAll();
	}

	@Override
	public Object findByd(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Passenger save(Passenger passenger) {
		return repository.save(passenger);
	}

	@Override
	public Passenger update(Integer id, Passenger passengerRequest) {
		
		return  repository.findById(id).map(passenger -> {
			passenger.setName(passengerRequest.getName());
			passenger.setEmail(passenger.getEmail());
			return save(passenger);
		}).orElseThrow(() -> new ResourceNotFoundException("No se encontro el pasajero con el id " + id ));
	}

	@Override
	public Boolean delete(Integer id) {
		
		return null;
	}

}
