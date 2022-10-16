package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="papeleria")
public class Papeleria {
	@Id
	@Column(name="id_papeleria") 
	private Integer id_papeleria;
	@Column(name="descripcion")
	private String descripcion;
	
	public Papeleria(Integer id_papeleria, String descripcion) {
	
		this.id_papeleria = id_papeleria;
		this.descripcion = descripcion;
	}

	public Papeleria() {
		
	}

	public Integer getId_ciudad() {
		return id_papeleria;
	}

	public void setId_Papeleria(Integer id_papeleria) {
		this.id_papeleria = id_papeleria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Papeleria [id_papeleria=" + id_papeleria + ", descripcion=" + descripcion + "]";
	}
	
	

}
