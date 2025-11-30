package com.juan.daniel.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.juan.daniel.curso.springboot.di.factura.springboot_difactura.model.Item;
import com.juan.daniel.curso.springboot.di.factura.springboot_difactura.model.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("producto 1", 800L);
        Product p2 = new Product("producto 2", 1200L);
        return Arrays.asList(new Item(p1, 2), new Item(p2, 4));
    }

    @Bean
    @Primary
    List<Item> itemsInvoiceOficina(){
        Product p3 = new Product("producto 3", 1100L);
        Product p4 = new Product("producto 4", 1400L);
        return Arrays.asList(new Item(p3, 2), new Item(p4, 4));
    }

}
