package com.innovapp.tickets.service;

import java.util.List;

import com.innovapp.tickets.model.Airplane;


public interface AirplaneService {

	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @return
	 */
	List<Airplane> findAll();
	
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
	Airplane save(Airplane airplane);
	
	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @param ticket
	 * @return
	 */
	Airplane update(Integer id , Airplane airplane);
	
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
