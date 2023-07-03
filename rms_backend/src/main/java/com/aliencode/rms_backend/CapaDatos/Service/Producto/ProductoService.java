package com.aliencode.rms_backend.CapaDatos.Service.Producto;

import java.util.List;

import com.aliencode.rms_backend.CapaDatos.Entity.Categoria;
import com.aliencode.rms_backend.CapaDatos.Entity.Producto;

public interface ProductoService {
    Producto agregarProducto(Producto producto);

    Producto actualizarProducto(Producto producto);

    List<Producto> obtenerProductos();

    Producto obtenerProducto(Integer id_producto);

    void eliminarProducto(Integer id_producto);

    List<Producto> listarProductosDeunaCategoria(Categoria categoria);

    List<Producto> ObtenerProductosActivos();

    List<Producto> ObtenerProductosActivosDeunaCategoria(Categoria categoria);


}
