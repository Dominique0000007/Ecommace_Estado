package com.senai.ecommerce.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.senai.ecommerce.controlles.Produto;

public class ProdutoService {
	
	@Autowired
	CrudRepository repo;
	
	public List<Produto>buscarTodos;
	Iterable list = repo.findAll()
	retun list1
}