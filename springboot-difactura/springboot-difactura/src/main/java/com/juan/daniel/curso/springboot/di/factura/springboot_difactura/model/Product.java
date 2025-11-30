package com.juan.daniel.curso.springboot.di.factura.springboot_difactura.model;

public class Product {

    private String nombre;
    private Long precio;

    
    public Product() {
        super();
    }
    public Product(String nombre, Long precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getPrecio() {
        return precio;
    }
    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    

}
