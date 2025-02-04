package com.senai.ecommerce.entities.services;

import com.senai.ecommerce.controlles.Produto;

public interface ProdutoRepository {

	Listr<Produto> findAll();

}
