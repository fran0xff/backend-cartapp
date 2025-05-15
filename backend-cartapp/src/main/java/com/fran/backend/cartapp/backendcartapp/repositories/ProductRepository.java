package com.fran.backend.cartapp.backendcartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fran.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository <Product, Long> {

    
}
