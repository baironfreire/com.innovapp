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

import com.innovapp.tickets.model.Airplane;
import com.innovapp.tickets.service.AirplaneService;

@RestController
public class AirplaneController {

	@Autowired
	private AirplaneService service;
	
	@GetMapping("/airplane")
	public List<Airplane> findAll(){
		return service.findAll();
	}
	
	
	@GetMapping("/airplane/{id}")
	public Object findById(@PathVariable Integer id){
		return service.findByd(id);
	}
	
	@PostMapping("/airplane")
	public Airplane save(@Valid @RequestBody Airplane airplane){
		return service.save(airplane);
	}
	
	@PutMapping("/airplane")
	public Airplane update(@PathVariable Integer id, @Valid @RequestBody Airplane airplanetRequest){
		return service.update(id, airplanetRequest);
	}
}
