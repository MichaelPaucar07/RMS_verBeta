package com.aliencode.rms_backend.CapaDatos.Service.Producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliencode.rms_backend.CapaDatos.Entity.Categoria;
import com.aliencode.rms_backend.CapaDatos.Entity.Producto;
import com.aliencode.rms_backend.CapaDatos.Repository.ProductoRepositorio;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public Producto agregarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    @Override
    public List<Producto> obtenerProductos() {
       return productoRepositorio.findAll();
    }

    @Override
    public Producto obtenerProducto(Integer id_producto) {
        return productoRepositorio.findById(id_producto).get();
    }

    @Override
    public void eliminarProducto(Integer id_producto) {
       Producto producto = new Producto();
       producto.setId_producto(id_producto);
       productoRepositorio.delete(producto);
    }

    @Override
    public List<Producto> listarProductosDeunaCategoria(Categoria categoria) {
       return this.productoRepositorio.findByCategoria(categoria);
    }

    @Override
    public List<Producto> ObtenerProductosActivos() {
        return productoRepositorio.findByEstado("Disponible");
    }

    @Override
    public List<Producto> ObtenerProductosActivosDeunaCategoria(Categoria categoria) {
        return productoRepositorio.findByCategoriaAndEstado(categoria, "Disponible");
    }
    
}