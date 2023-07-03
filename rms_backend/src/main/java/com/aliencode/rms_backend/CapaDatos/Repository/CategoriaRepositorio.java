package com.aliencode.rms_backend.CapaDatos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliencode.rms_backend.CapaDatos.Entity.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer>{
     
}
