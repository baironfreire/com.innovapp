package com.innovapp.tickets.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="flight")
public class Flight {

	@Id
    @GeneratedValue(generator = "flight_generator")
    @SequenceGenerator(
            name = "flight_generator",
            sequenceName = "flight_sequence",
            initialValue = 1000
    )
	private Integer Id;
	
	@NotNull
	@Size(max=45)
	private String description;
	
	@NotNull
	private Date departureDate;
	
	@NotNull
	@Size(max=45)
	private String originCity;
	
	@NotNull
	@Size(max=45)
	private String destinationCity;

	public Flight() {}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Integer getId() {
		return Id;
	}
	
	
	
	
}
