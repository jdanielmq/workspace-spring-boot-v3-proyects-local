package com.daniel.curso.inyeccion.di.app.inyeccion_dependencia.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.curso.inyeccion.di.app.inyeccion_dependencia.models.Product;
import com.daniel.curso.inyeccion.di.app.inyeccion_dependencia.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class SomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public List<Product> getProductAll() {
        return productService.findAll();
    }
    
    @GetMapping("/{id}")
    public Product getMethodName(@PathVariable Long id) {
        return productService.findById(id);
    }
    
 
}
