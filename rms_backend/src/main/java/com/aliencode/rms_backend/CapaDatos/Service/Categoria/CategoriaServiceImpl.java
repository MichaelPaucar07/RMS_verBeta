package com.aliencode.rms_backend.CapaDatos.Service.Categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliencode.rms_backend.CapaDatos.Entity.Categoria;
import com.aliencode.rms_backend.CapaDatos.Repository.CategoriaRepositorio;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Override
    public Categoria agregarCategoria(Categoria categoria) {
       return categoriaRepositorio.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public List<Categoria> obtenerCategorias() {
       return categoriaRepositorio.findAll();
    }

    @Override
    public Categoria obtenerCategoria(Integer id_categoria) {
        return categoriaRepositorio.findById(id_categoria).get();
    }

    @Override
    public void eliminarCategoria(Integer id_categoria) {
        Categoria categoria = new Categoria();
        categoria.setId_categoria(id_categoria);
        categoriaRepositorio.delete(categoria);
    }
    
}