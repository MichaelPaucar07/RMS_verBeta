package com.aliencode.rms_backend.CapaDatos.Entity;

import javax.persistence.*;

@Entity
public class UsuarioRol{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario_rol;

    @ManyToOne(fetch =  FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne
    private Rol rol;

    
    public UsuarioRol(){
        
    }


    public UsuarioRol(int id_usuario_rol, Usuario usuario, Rol rol) {
        this.id_usuario_rol = id_usuario_rol;
        this.usuario = usuario;
        this.rol = rol;
    }


    public int getId_usuario_rol() {
        return id_usuario_rol;
    }


    public void setId_usuario_rol(int id_usuario_rol) {
        this.id_usuario_rol = id_usuario_rol;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Rol getRol() {
        return rol;
    }


    public void setRol(Rol rol) {
        this.rol = rol;
    }

}