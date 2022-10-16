package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class Ciudad {
	@Id
	@Column(name="id_ciudad") 
	private Integer id_ciudad;
	@Column(name="descripcion")
	private String descripcion;
	
	public Ciudad(Integer id_ciudad, String descripcion) {
	
		this.id_ciudad = id_ciudad;
		this.descripcion = descripcion;
	}

	public Ciudad() {
		
	}

	public Integer getId_ciudad() {
		return id_ciudad;
	}

	public void setId_Ciudad(Integer id_ciudad) {
		this.id_ciudad = id_ciudad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Ciudad [id_ciudad=" + id_ciudad + ", descripcion=" + descripcion + "]";
	}
	
	

}
