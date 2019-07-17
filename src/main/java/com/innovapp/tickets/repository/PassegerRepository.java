package com.innovapp.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovapp.tickets.model.Passenger;

/**
 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a>
 * @project tickets
 * @class PassegerRepository
 * @description
 * @date 17/07/2019
 */
public interface PassegerRepository extends JpaRepository<Passenger, Integer> {

}
