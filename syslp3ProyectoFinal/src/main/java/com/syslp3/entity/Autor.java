package com.syslp3.entity;

public class Autor {
	private int idautor;
	private String nombres;
	private String apellidos;
	
	public Autor() {
		
	}
	public Autor(int idautor, String nombres, String apellidos) {
		this.idautor = idautor;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}
	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
}
