package com.innovapp.tickets.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.innovapp.tickets.exception.ResourceNotFoundException;
import com.innovapp.tickets.model.Airplane;
import com.innovapp.tickets.repository.AirplaneRepository;
import com.innovapp.tickets.service.AirplaneService;

@Service
@Transactional
public class AirplaneServiceImpl implements AirplaneService {

	@Autowired
	private AirplaneRepository repository;
	
	@Override
	public List<Airplane> findAll() {
		return repository.findAll();
	}

	@Override
	public Object findByd(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Airplane save(Airplane airplane) {
		return repository.save(airplane);
	}

	@Override
	public Airplane update(Integer id, Airplane airplaneRequest) {
		return  repository.findById(id).map(airplane -> {
			airplane.setAirline(airplaneRequest.getAirline());
			airplane.setDescription(airplaneRequest.getDescription());
			airplane.setMaximunQuantity(airplaneRequest.getMaximunQuantity());
			return save(airplane);
		}).orElseThrow(() -> new ResourceNotFoundException("No se encontro el avion con el id " + id ));
	}

	@Override
	public Boolean delete(Integer id) {
		return null;
	}

}
