package com.group.firstapirest.repository;

import com.group.firstapirest.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();

    public void createProductos(){
        productos = List.of(
          new Producto(1, "Producto 01", 10, 1000),
          new Producto(2, "Producto 02", 11, 9000),
          new Producto(3, "Producto 03", 12, 8000),
          new Producto(4, "Producto 04", 13, 7000),
          new Producto(5, "Producto 05", 14, 6000),
          new Producto(6, "Producto 06", 15, 5000),
          new Producto(7, "Producto 07", 16, 4000),
          new Producto(8, "Producto 08", 17, 3000),
          new Producto(9, "Producto 09", 18, 2000)
        );
    }

    //GET ALL
    public List<Producto> getAllProductos(){
        return productos;
    }

    //GET ID
    public Producto findById(int id){
     for (Producto producto : productos){
         if (producto.getId() == id){
             return producto;
         }
     }
        return null;
    }

    //GET NOMBRE
    public List<Producto> search(String nombre){
        return productos.stream()
                .filter(x -> x.getNombre().startsWith(nombre))
                .collect(Collectors.toList());
    }

    //POST
    public Producto saveProducto(Producto p){

        Producto producto = new Producto();
        producto.setId(p.getId());
        producto.setNombre(p.getNombre());
        producto.setCantidad(p.getCantidad());
        producto.setPrecio(p.getPrecio());
        productos.add(producto);
        return producto;
    }

    //DELETE

    public Producto delete(int id) {
        for (Producto producto: productos){
            if (producto.getId() == id){
                productos.remove(producto);
            }
        }
        return null;
    }

    //ACTUALIZAR
    public Producto update (Producto producto){
        //COMPROBAR SI EXISTE
        int id = 0; //Guarda el id del producto que se va a actualizar
        int idPosicion = 0; //Guarda la posición de la lista que ocupa el producto que se va a actualizar
        for (Producto produ: productos){
            if (produ.getId() == producto.getId()){
                id = productos.indexOf(produ);
                idPosicion = produ.getId();
                break;
            }
        }

        Producto producto1 = new Producto();
        producto1.setId(id);
        producto1.setNombre(producto.getNombre());
        producto1.setPrecio(producto.getPrecio());
        producto1.setCantidad(producto.getCantidad());
        productos.set(idPosicion, producto1);
        return producto1;
    }


}
