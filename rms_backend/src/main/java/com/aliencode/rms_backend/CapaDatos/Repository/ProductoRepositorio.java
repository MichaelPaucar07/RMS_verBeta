package com.aliencode.rms_backend.CapaDatos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliencode.rms_backend.CapaDatos.Entity.Categoria;
import com.aliencode.rms_backend.CapaDatos.Entity.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
    List<Producto> findByCategoria(Categoria categoria);

    List<Producto> findByEstado(String estado);

    List<Producto> findByCategoriaAndEstado(Categoria categoria,String estado);
}