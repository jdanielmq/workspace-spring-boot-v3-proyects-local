package com.daniel.curso.inyeccion.di.app.inyeccion_dependencia.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.curso.inyeccion.di.app.inyeccion_dependencia.models.Product;
import com.daniel.curso.inyeccion.di.app.inyeccion_dependencia.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 1.25d;
            Product product = (Product)p.clone();
            product.setPrice(priceImp.longValue());
            return product;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }



}
