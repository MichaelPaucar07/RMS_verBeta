package com.aliencode.rms_backend.CapaDatos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aliencode.rms_backend.CapaDatos.Entity.Categoria;
import com.aliencode.rms_backend.CapaDatos.Entity.Producto;
import com.aliencode.rms_backend.CapaDatos.Service.Producto.ProductoService;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    
    @PostMapping("/")
    public ResponseEntity<Producto> agregarProducto(@RequestBody Producto producto) {
        Producto nuevoProducto = productoService.agregarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoProducto);
    }

    @GetMapping("/")
    public ResponseEntity<List<Producto>>listarProductos() {
        List<Producto> productos = productoService.obtenerProductos();
        return ResponseEntity.ok(productos);
    }


    @PutMapping("/{id_producto}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable("id_producto") Integer id_producto, @RequestBody Producto producto) {
        producto.setId_producto(id_producto);
        Producto productoActualizado = productoService.actualizarProducto(producto);
        return ResponseEntity.ok(productoActualizado);
    }


    @GetMapping("/{id_producto}")
    public ResponseEntity<Producto> listarProducto(@PathVariable("id_producto") Integer id_producto) {
        Producto producto = productoService.obtenerProducto(id_producto);
        if (producto != null) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id_producto}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable("id_producto") Integer id_producto) {
        productoService.eliminarProducto(id_producto);
        return ResponseEntity.noContent().build();
    }

     @GetMapping("/categoria/{id_producto}")
    public List<Producto> listarProductosDeUnaCategoria(@PathVariable("id_categoria") Integer id_categoria){
        Categoria categoria = new Categoria();
        categoria.setId_categoria(id_categoria);
        return productoService.listarProductosDeunaCategoria(categoria);
    }

    @GetMapping("/activo")
    public List<Producto> listarProductosActivos(){
        return productoService.ObtenerProductosActivos();
    }

    @GetMapping("/categoria/activo/{id_producto}")
    public List<Producto> listarExamenesActivosDeUnaCategoria(@PathVariable("id_categoria") Integer id_categoria){
        Categoria categoria = new Categoria();
        categoria.setId_categoria(id_categoria);
        return productoService.ObtenerProductosActivosDeunaCategoria(categoria);
    }
}
