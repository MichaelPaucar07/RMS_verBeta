package com.aliencode.rms_backend.CapaDatos.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Detalle_carrito")
public class Detalle_carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_detalle_carrito;

    private int cantidad;

    @ManyToOne
    private Producto producto;

    @ManyToOne
    private Carrito carrito;

    public Detalle_carrito() {
    }

    public Detalle_carrito(int id_detalle_carrito, int cantidad, Producto producto, Carrito carrito) {
        this.id_detalle_carrito = id_detalle_carrito;
        this.cantidad = cantidad;
        this.producto = producto;
        this.carrito = carrito;
    }

    public int getId_detalle_carrito() {
        return id_detalle_carrito;
    }

    public void setId_detalle_carrito(int id_detalle_carrito) {
        this.id_detalle_carrito = id_detalle_carrito;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

}
