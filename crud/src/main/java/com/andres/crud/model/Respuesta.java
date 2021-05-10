package com.andres.crud.model;

public class Respuesta {

	private Integer cveError;
	private String cveMensaje;
	private Object resultado;
	
	
	
	public Respuesta(Integer cveError, String cveMensaje, Object resultado) {
		this.cveError = cveError;
		this.cveMensaje = cveMensaje;
		this.resultado = resultado;
	}
	
	public Integer getCveError() {
		return cveError;
	}
	public void setCveError(Integer cveError) {
		this.cveError = cveError;
	}
	public String getCveMensaje() {
		return cveMensaje;
	}
	public void setCveMensaje(String cveMensaje) {
		this.cveMensaje = cveMensaje;
	}
	public Object getResultado() {
		return resultado;
	}
	public void setResultado(Object resultado) {
		this.resultado = resultado;
	}
	
	
}
