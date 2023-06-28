package com.aliencode.rms_backend.CapaDatos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliencode.rms_backend.CapaDatos.Entity.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer>{
    
    public Usuario findByUsername(String username);
    
}
