package com.daniel.curso.inyeccion.di.app.inyeccion_dependencia.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.curso.inyeccion.di.app.inyeccion_dependencia.models.Product;

@Service
public class ProductRepository {

    private List<Product> data;

    public ProductRepository(){
        this.data = Arrays.asList(
            new Product(1L, "Producto 1", 3500L),
            new Product(2L, "Producto 2", 4000L),
            new Product(3L, "Producto 3", 4500L)
        );
    }

    public List<Product> findAll(){
        return data;
    }

    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);

    }
}
