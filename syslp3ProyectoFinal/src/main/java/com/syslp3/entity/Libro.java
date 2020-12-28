package com.syslp3.entity;


public class Libro {
	private int idlibro;
	private String titulo;
	private String edicion;
	private String year;
	private int idcategoria;
	private int ideditorial;
	private int idautor;
	
	public Libro() {
		
	}
	
	public Libro(int idlibro, String titulo, String edicion, String year, int idcategoria, int ideditorial,
			int idautor) {
		
		this.idlibro = idlibro;
		this.titulo = titulo;
		this.edicion = edicion;
		this.year = year;
		this.idcategoria = idcategoria;
		this.ideditorial = ideditorial;
		this.idautor = idautor;
	}
	public int getIdlibro() {
		return idlibro;
	}
	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public int getIdeditorial() {
		return ideditorial;
	}
	public void setIdeditorial(int ideditorial) {
		this.ideditorial = ideditorial;
	}
	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	
	
	
}
