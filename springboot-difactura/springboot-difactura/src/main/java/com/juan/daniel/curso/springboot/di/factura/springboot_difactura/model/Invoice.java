package com.juan.daniel.curso.springboot.di.factura.springboot_difactura.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Invoice {

    @Autowired
    private Client client;
    @Value("${invoice.description}")
    private String description;
    @Autowired
    private List<Item> items;

    @PostConstruct
    public void init(){
        /* se pueden hacer cambios despues que se inicia el compomente*/

    }
    @PreDestroy
    public void destroy(){
        /* se colocan los objetod que quieres destruir o limpiar para volver ocupar*/

    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public long getTotal(){

        long total = items.stream()
        .map(item -> item.getImporte())
        .reduce(0L, (sum, importe) -> sum + importe);

        return total;
    }


    

}
