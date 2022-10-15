package com.edu.unab.model.entity;

import java.util.Date;


public class Ventas {

	private Integer id_ventas;
	private Integer id_cliente;
	private Date fecha;
	private String tipoPago;
	private Integer valorTotal;
	private Integer id_producto;
	
	public Ventas() {
		super();
	}

	public Ventas(Integer id_ventas, Integer id_cliente, Date fecha, String tipoPago, Integer valorTotal,
			Integer id_producto) {
		super();
		this.id_ventas = id_ventas;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
		this.tipoPago = tipoPago;
		this.valorTotal = valorTotal;
		this.id_producto = id_producto;
	}

	public Integer getId_ventas() {
		return id_ventas;
	}

	public void setId_ventas(Integer id_ventas) {
		this.id_ventas = id_ventas;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public Integer getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Integer valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	@Override
	public String toString() {
		return "Ventas [id_ventas=" + id_ventas + ", id_cliente=" + id_cliente + ", fecha=" + fecha + ", tipoPago="
				+ tipoPago + ", valorTotal=" + valorTotal + ", id_producto=" + id_producto + "]";
	}

	
	
}

