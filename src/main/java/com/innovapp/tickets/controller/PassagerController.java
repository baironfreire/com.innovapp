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
import com.innovapp.tickets.model.Passenger;
import com.innovapp.tickets.repository.PassengerRepository;
import com.innovapp.tickets.service.PassengerService;

/**
 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a>
 * @project tickets
 * @class PassagerController
 * @description
 * @date 17/07/2019
 */
@RestController
public class PassagerController {

	@Autowired
	private PassengerService service;
	
	
	
	@GetMapping("/passenger")
	public List<Passenger> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/passenger/{id}")
	public Object findById(@PathVariable Integer id){
		return service.findByd(id);
	}
	
	@PostMapping("/passenger")
	public Passenger save(@Valid @RequestBody Passenger passeger){
		return service.save(passeger);
	}
	
	@PutMapping("/passenger/{id}")
	public Passenger update(@PathVariable Integer id, @Valid @RequestBody Passenger passengerRequest){
		return service.update(id, passengerRequest);
	}
	
	
}
