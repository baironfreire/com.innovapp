package com.innovapp.tickets.service;

import java.util.List;

import com.innovapp.tickets.model.Passenger;

public interface PassengerService {

	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @return
	 */
	List<Passenger> findAll();
	
	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @param id
	 * @return
	 */
	Object findByd(Integer id);
	
	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @param ticket
	 * @return
	 */
	Passenger save(Passenger passenger);
	
	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @param ticket
	 * @return
	 */
	Passenger update(Integer id , Passenger passenger);
	
	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @param id
	 * @return
	 */
	Boolean delete(Integer id);
}
