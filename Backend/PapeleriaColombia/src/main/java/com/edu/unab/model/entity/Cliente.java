package com.edu.unab.model.entity;

public class Cliente {

	private Integer id_clientes;
	private String estado;
	private Integer id_usuario;
	
	public Cliente() {
		super();
	}
	
	public Cliente(Integer id_clientes, String estado, Integer id_usuario) {
		super();
		this.id_clientes = id_clientes;
		this.estado = estado;
		this.id_usuario = id_usuario;
	}

	public Integer getId_clientes() {
		return id_clientes;
	}

	public void setId_clientes(Integer id_clientes) {
		this.id_clientes = id_clientes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Cliente [id_clientes=" + id_clientes + ", estado=" + estado + ", id_usuario=" + id_usuario + "]";
	}
	
	
}
