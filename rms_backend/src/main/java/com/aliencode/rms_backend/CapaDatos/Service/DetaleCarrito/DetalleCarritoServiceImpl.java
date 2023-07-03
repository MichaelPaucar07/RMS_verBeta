package com.aliencode.rms_backend.CapaDatos.Service.DetaleCarrito;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliencode.rms_backend.CapaDatos.Entity.Detalle_carrito;
import com.aliencode.rms_backend.CapaDatos.Entity.Producto;
import com.aliencode.rms_backend.CapaDatos.Repository.Detalle_CarritoRepositorio;

@Service
public class DetalleCarritoServiceImpl implements DetalleCarritoService {

    @Autowired
    private Detalle_CarritoRepositorio detalle_CarritoRepositorio;

    @Override
    public Detalle_carrito agregarDetalleCarrito(Detalle_carrito detalle_carrito) {
        return detalle_CarritoRepositorio.save(detalle_carrito);
    }

    @Override
    public Detalle_carrito actualizarDetalleCarrito(Detalle_carrito detalle_carrito) {
        return detalle_CarritoRepositorio.save(detalle_carrito);
    }

    @Override
    public List<Detalle_carrito> obtenerDetalleCarritos() {
       return detalle_CarritoRepositorio.findAll();
    }

    @Override
    public Detalle_carrito obtenerDetalleCarrito(Integer id_detalle_carrito) {
        return detalle_CarritoRepositorio.findById(id_detalle_carrito).get();
    }

    @Override
    public List<Detalle_carrito> obtenerDetalleCarritosDelProducto(Producto producto) {
        return detalle_CarritoRepositorio.findByProducto(producto);
    }

    @Override
    public void eliminarDetalleCarrito(Integer id_detalle_carrito) {
        Detalle_carrito detalle_carrito = new Detalle_carrito();
        detalle_carrito.setId_detalle_carrito(id_detalle_carrito);
        detalle_CarritoRepositorio.delete(detalle_carrito);
    }

}
