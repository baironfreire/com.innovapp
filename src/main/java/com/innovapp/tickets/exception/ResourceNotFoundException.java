package com.innovapp.tickets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a>
 * @project tickets
 * @class ResourceNotFoundException
 * @description
 * @date 17/07/2019
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/** 
	 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a> 
	 * @date 17/07/2019
	 */ 
	private static final long serialVersionUID = 7408978276237363458L;
	
	public ResourceNotFoundException(String message){
		super(message);
	}
	
	public ResourceNotFoundException(String message, Throwable cause){
		super(message, cause);
	}

}
