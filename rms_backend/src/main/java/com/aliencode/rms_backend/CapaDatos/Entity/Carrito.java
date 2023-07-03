package com.aliencode.rms_backend.CapaDatos.Entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Carrito")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_carrito;

    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Detalle_carrito> detalle_carritos = new ArrayList<>();

    @ManyToOne
    private Usuario usuario;

    public Carrito(){

    }

    public Carrito(int id_carrito, List<Detalle_carrito> detalle_carritos, Usuario usuario) {
        this.id_carrito = id_carrito;
        this.detalle_carritos = detalle_carritos;
        this.usuario = usuario;
    }

    public int getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public List<Detalle_carrito> getDetalle_carritos() {
        return detalle_carritos;
    }

    public void setDetalle_carritos(List<Detalle_carrito> detalle_carritos) {
        this.detalle_carritos = detalle_carritos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
