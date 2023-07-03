package com.aliencode.rms_backend.CapaDatos.Service.DetaleCarrito;

import java.util.List;

import com.aliencode.rms_backend.CapaDatos.Entity.Detalle_carrito;
import com.aliencode.rms_backend.CapaDatos.Entity.Producto;

public interface DetalleCarritoService {

    Detalle_carrito agregarDetalleCarrito( Detalle_carrito detalle_carrito);

    Detalle_carrito actualizarDetalleCarrito(Detalle_carrito detalle_carrito);

    List<Detalle_carrito> obtenerDetalleCarritos();

    Detalle_carrito obtenerDetalleCarrito(Integer id_detalle_carrito);

    List<Detalle_carrito> obtenerDetalleCarritosDelProducto(Producto producto);

    void eliminarDetalleCarrito(Integer id_detalle_carrito);

}
