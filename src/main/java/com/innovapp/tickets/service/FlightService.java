package com.innovapp.tickets.service;

import java.util.List;

import com.innovapp.tickets.model.Flight;

public interface FlightService {

	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @return
	 */
	List<Flight> findAll();
	
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
	Flight save(Flight flight);
	
	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @param ticket
	 * @return
	 */
	Flight update(Integer id , Flight flight);
	
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
