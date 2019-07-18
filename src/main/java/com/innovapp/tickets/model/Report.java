package com.innovapp.tickets.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


public class Report {

	@NotNull
	private Date fecIni;
	
	@NotNull
	private Date fecFIn;

	public Report() {	}

	public Date getFecIni() {
		return fecIni;
	}

	public void setFecIni(Date fecIni) {
		this.fecIni = fecIni;
	}

	public Date getFecFIn() {
		return fecFIn;
	}

	public void setFecFIn(Date fecFIn) {
		this.fecFIn = fecFIn;
	}
	
	
	
	
}
