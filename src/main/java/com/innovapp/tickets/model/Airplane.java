package com.innovapp.tickets.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="planes")
public class Airplane {

	@Id
    @GeneratedValue(generator = "planes_generator")
    @SequenceGenerator(
            name = "planes_generator",
            sequenceName = "planes_sequence",
            initialValue = 1
    )
	private Integer Id;
	
	@NotNull
	@Size(max=45)
	private String airline;
	
	@NotNull
	@Size(max=45)
	private String description;
	
	@NotNull
	private Integer maximunQuantity;

	public Airplane() {	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getMaximunQuantity() {
		return maximunQuantity;
	}

	public void setMaximunQuantity(Integer maximunQuantity) {
		this.maximunQuantity = maximunQuantity;
	}

	public Integer getId() {
		return Id;
	}
	
	
	
	
}
