package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="producto")

public class Producto {
	
	@Id
	@Column(name = "id_producto")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private Double precio;
	
	@Column(name = "id_provedor")
	private Integer id_provedor;
	
	
	
	
	
	

}
