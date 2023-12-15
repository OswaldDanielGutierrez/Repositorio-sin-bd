package com.group.firstapirest.controller;

import com.group.firstapirest.model.Producto;
import com.group.firstapirest.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto agregarProducto (@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @GetMapping("/{id}")
    public List<Producto> listarProductos (){
        return productoService.getProductos();
    }

    @GetMapping
    public Producto buscarProductp(@PathVariable int id){
        return productoService.getProducto(id);
    }

    @PutMapping
    public Producto actualizarProducto(@RequestBody Producto producto){
        return productoService.updateProducto(producto);
    }

    @DeleteMapping("/id")
    public void borrarProducto(@PathVariable int id){
        productoService.deleteProducto(id);
    }


}
