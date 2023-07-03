package com.aliencode.rms_backend.CapaDatos.Entity;

import java.util.ArrayList;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
	
    private String nombre;
    private String tipo;
    private String descripcion;
    private String imagen;
    private int cantidad_stock;
    private float precio;
    private String estado;

    @ManyToOne
    private Categoria categoria;

	@OneToMany(mappedBy = "producto",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Detalle_carrito> detalle_carritos = new ArrayList<>();
	

    public Producto(){

    }


    public Producto(int id_producto, String nombre, String tipo, String descripcion, String imagen, int cantidad_stock,
            float precio, String estado, Categoria categoria, List<Detalle_carrito> detalle_carritos) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.cantidad_stock = cantidad_stock;
        this.precio = precio;
        this.estado = estado;
        this.categoria = categoria;
        this.detalle_carritos = detalle_carritos;
    }


    public int getId_producto() {
        return id_producto;
    }


    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getImagen() {
        return imagen;
    }


    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    public int getCantidad_stock() {
        return cantidad_stock;
    }


    public void setCantidad_stock(int cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }


    public float getPrecio() {
        return precio;
    }


    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public List<Detalle_carrito> getDetalle_carritos() {
        return detalle_carritos;
    }


    public void setDetalle_carritos(List<Detalle_carrito> detalle_carritos) {
        this.detalle_carritos = detalle_carritos;
    }


    
    
}