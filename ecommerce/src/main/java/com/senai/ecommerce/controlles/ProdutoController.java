package com.senai.ecommerce.controlles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.ecommerce.entities.services.ProdutoService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoService sercice;
	
	@GetMapping
	public ResponceEntity buscar(){
		Object servise;
		return  ResponceEntity.ok().buscarTodos();
	}

}
