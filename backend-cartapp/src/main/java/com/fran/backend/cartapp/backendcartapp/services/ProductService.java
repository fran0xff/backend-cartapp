package com.fran.backend.cartapp.backendcartapp.services;

import java.util.List;

import com.fran.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {

    List<Product> findAll();

}
