package com.aliencode.rms_backend.CapaDatos.Entity;

import javax.persistence.*;

import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Date;
import java.util.ArrayList;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import com.aliencode.rms_backend.CapaLogica.Security.Entity.Authority;
import java.util.Collection;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Usuarios")
public class Usuario implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fecha_nac;
    private String telefono;
    private String email;

    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    @JsonIgnore
    private List<UsuarioRol> usuarioRoles = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    @JsonIgnore
    private List<Carrito> carritos = new ArrayList<>();

    public Usuario(){
        
    }

    public Usuario(int id, String username, String password, String cedula, String nombres, String apellidos,
            Date fecha_nac, String telefono, String email, List<UsuarioRol> usuarioRoles, List<Carrito> carritos) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.email = email;
        this.usuarioRoles = usuarioRoles;
        this.carritos = carritos;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(List<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<Authority> autoridades = new ArrayList<>();
        this.usuarioRoles.forEach(usuarioRoles->{
            autoridades.add(new Authority(usuarioRoles.getRol().getNombre()));
        });
        return autoridades;
    }

    @Override
    public boolean isAccountNonExpired() {
       return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
       return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public List<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(List<Carrito> carritos) {
        this.carritos = carritos;
    }
}
