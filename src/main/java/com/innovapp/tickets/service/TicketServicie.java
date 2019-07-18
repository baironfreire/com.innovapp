package com.innovapp.tickets.service;

import java.util.Date;
import java.util.List;

import com.innovapp.tickets.model.Ticket;

public interface TicketServicie  {
	
	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @return
	 */
	List<Ticket> findAll();
	
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
	Ticket save(Ticket ticket);
	
	/**
	 * 
	 * 
	 * @date 17/07/2019
	 * @description 
	 * @CU_HU_REQ 
	 * @param ticket
	 * @return
	 */
	Ticket update(Integer id , Ticket ticket);
	
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
