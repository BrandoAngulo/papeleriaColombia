package com.edu.unab.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.Categoria;
import com.edu.unab.repository.CategoriaRepository;

public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Categoria> findAll() {
		
		return categoriaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Categoria> findById(Integer id) {
		
		return categoriaRepository.findById(id);
	}

	@Override
	@Transactional
	public Categoria save(Categoria c) {
		
		return categoriaRepository.save(c);
	}

	@Override
	@Transactional
	public Void deleteByIdVoid(Integer id) {
		
		categoriaRepository.deleteById(id);
		
		
		
	}

	
		
	

	
}
