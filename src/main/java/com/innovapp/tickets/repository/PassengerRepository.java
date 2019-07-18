package com.innovapp.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovapp.tickets.model.Passenger;

/**
 * 
 * @project tickets
 * @class PassengerRepository
 * @description
 * @date 17/07/2019
 */
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
