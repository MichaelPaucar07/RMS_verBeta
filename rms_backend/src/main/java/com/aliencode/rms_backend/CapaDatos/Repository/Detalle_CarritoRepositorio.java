package com.aliencode.rms_backend.CapaDatos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliencode.rms_backend.CapaDatos.Entity.Detalle_carrito;
import com.aliencode.rms_backend.CapaDatos.Entity.Producto;

public interface Detalle_CarritoRepositorio extends JpaRepository<Detalle_carrito,Integer>{
    //BUSCAR PRODUCTOS DE DETALLES DE CARRITO
    List<Detalle_carrito> findByProducto(Producto producto);
}
