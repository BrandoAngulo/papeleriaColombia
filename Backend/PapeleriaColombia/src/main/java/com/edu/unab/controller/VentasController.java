package com.edu.unab.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.edu.unab.model.entity.Ventas;
import com.edu.unab.model.service.VentasService;

@RestControllerAdvice
@RequestMapping("/api/ventas")

public class VentasController {
	
	
	@Autowired 
	private VentasService ventasService;
	
	@PostMapping
	public Ventas guardar(@RequestBody Ventas ventas) {
		return ventasService.save(ventas);
	}
	
	@GetMapping("/{id}")
	public Optional<Ventas>buscarPorId(@PathVariable Integer id){
		return ventasService.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Ventas>listarTodos(){
		return ventasService.findAll();
		
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		ventasService.deleteById(id);
	}
}
