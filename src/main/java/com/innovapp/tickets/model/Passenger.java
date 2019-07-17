package com.innovapp.tickets.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a>
 * @project tickets
 * @class Passenger
 * @description
 * @date 17/07/2019
 */
@Entity
@Table(name="passengers")
public class Passenger {
	
	@Id
    @GeneratedValue(generator = "passengers_generator")
    @SequenceGenerator(
            name = "passengers_generator",
            sequenceName = "passengers_sequence",
            initialValue = 1000
    )
	private Integer Id;
	
	@NotBlank
	@Size(max=45)
	private String name;
	
	@NotBlank
	@Size(max=60)
	private String email;

	/** 
	 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a> 
	 * @date 17/07/2019  
	 */ 
	public Passenger() {}

	/** 
	 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a> 
	 * @date 17/07/2019 
	 * @return the name 
	 */
	public String getName() {
		return name;
	}

	/** 
	 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a> 
	 * @date 17/07/2019 
	 * @param name the name to set 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a> 
	 * @date 17/07/2019 
	 * @return the email 
	 */
	public String getEmail() {
		return email;
	}

	/** 
	 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a> 
	 * @date 17/07/2019 
	 * @param email the email to set 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** 
	 * @author <a href="mailto:bairon.f5@gmail.com">Bairon Fernando Freire Otalvaro</a> 
	 * @date 17/07/2019 
	 * @return the id 
	 */
	public Integer getId() {
		return Id;
	}
	
	
	
	
	
}
