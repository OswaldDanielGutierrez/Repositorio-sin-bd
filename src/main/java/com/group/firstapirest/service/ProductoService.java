package com.group.firstapirest.service;

import com.group.firstapirest.model.Producto;
import com.group.firstapirest.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto saveProducto (Producto producto){
        return productoRepository.saveProducto(producto);
    }

    public List<Producto> getProductos (){
        return productoRepository.getAllProductos();
    }

    public Producto getProducto(int id){
        return productoRepository.findById(id);
    }

    public String deleteProducto(int id){
        productoRepository.delete(id);
        return "Producto eliminado : "+id;
    }

    public Producto updateProducto (Producto producto){
        return productoRepository.update(producto);
    }

}
