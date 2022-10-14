package com.edu.unab.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.Producto;
import com.edu.unab.repository.ProductoRepository;

@Service
public class ProductoServiceImpl {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Producto> findAll(){
		return productoRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Producto> findById(Integer id){
		return productoRepository.findById(id);
	}

}
