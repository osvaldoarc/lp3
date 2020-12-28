package com.syslp3.entity;

public class Categoria {
	private int idcategoria;
	private String nomcat;
	
	public Categoria() {
		
	}
	
	public Categoria(int idcategoria, String nomcat) {
		this.idcategoria = idcategoria;
		this.nomcat = nomcat;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNomcat() {
		return nomcat;
	}
	public void setNomcat(String nomcat) {
		this.nomcat = nomcat;
	}
	
	
}
