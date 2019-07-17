package com.innovapp.tickets.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="planes")
public class Airplane {

	@Id
    @GeneratedValue(generator = "planes_generator")
    @SequenceGenerator(
            name = "planes_generator",
            sequenceName = "planes_sequence",
            initialValue = 1000
    )
	private Integer Id;
	
	@NotBlank
	@Size(max=45)
	private String airline;
	
	@NotBlank
	@Size(max=45)
	private String description;
	
	@NotBlank
	private Integer maximunQuantity;
}
