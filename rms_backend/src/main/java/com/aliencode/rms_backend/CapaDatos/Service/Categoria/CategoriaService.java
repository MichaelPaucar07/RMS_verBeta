package com.aliencode.rms_backend.CapaDatos.Service.Categoria;

import java.util.List;

import com.aliencode.rms_backend.CapaDatos.Entity.Categoria;

public interface CategoriaService{

    Categoria agregarCategoria(Categoria categoria);

    Categoria actualizarCategoria(Categoria categoria);

    List<Categoria> obtenerCategorias();

    Categoria obtenerCategoria(Integer id_categoria);

    void eliminarCategoria(Integer id_categoria);
}
 