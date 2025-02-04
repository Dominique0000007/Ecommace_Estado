package com.senai.ecommerce.entities.repositories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.senai.ecommerce.Produto.*;

public interface ProdurtoRepository extends JpaRespository<Produto, Long>{
}
