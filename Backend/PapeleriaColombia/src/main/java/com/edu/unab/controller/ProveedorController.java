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

import com.edu.unab.model.entity.Proveedor;
import com.edu.unab.model.service.ProveedorService;

@RestControllerAdvice
@RequestMapping("api/proveedor")
public class ProveedorController {

	@Autowired
	private ProveedorService proveedorService;

	@PostMapping
	public Proveedor guardar(@RequestBody Proveedor proveedor) {
		return proveedorService.save(proveedor);
	}

	@GetMapping("/{id}")
	public Optional<Proveedor> buscarPorId(@PathVariable Integer id) {
		return proveedorService.findById(id);
	}

	@GetMapping("listar")
	public Iterable<Proveedor> listarTodos() {
		return proveedorService.findAll();
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		proveedorService.deleteById(id);
	}
}
