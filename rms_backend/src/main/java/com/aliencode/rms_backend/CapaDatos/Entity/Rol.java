package com.aliencode.rms_backend.CapaDatos.Entity;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String rol_nombre;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
    private List<UsuarioRol> usuarioRoles;

    public Rol(){
        
    }

    public Rol(int id, String nombre, String rol_nombre, List<UsuarioRol> usuarioRoles) {
        this.id = id;
        this.nombre = nombre;
        this.rol_nombre = rol_nombre;
        this.usuarioRoles = usuarioRoles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol_nombre() {
        return rol_nombre;
    }

    public void setRol_nombre(String rol_nombre) {
        this.rol_nombre = rol_nombre;
    }

    public List<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(List<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }

    
}