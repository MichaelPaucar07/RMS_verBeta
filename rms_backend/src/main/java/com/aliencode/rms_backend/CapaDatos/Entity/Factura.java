// package com.aliencode.rms_backend.CapaDatos.Entity;


// import java.sql.Date;
// import javax.persistence.*;

// @Entity
// @Table(name = "Factura")
// public class Factura {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id_factura;

//     @OneToOne
//     @JoinColumn(name="id")
//     private Usuario usuario;

//     @OneToOne
//     @JoinColumn(name="id_orden_compra")
//     private Orden_compra orden_compra;
    
//     @ManyToOne
//     @JoinColumn(name = "id_articulo_carrito")
//     private Articulo_carrito articulo_carrito;

//     @Column(name = "num_Factura", nullable = false , length = 15)
//     private int num_Factura;
//     @Column(name = "fecha_factura",nullable = false)
//     private Date fecha_factura;
//     @Column(name = "subtotal_sinIVA",nullable = false)
//     private float subtotal_sinIVA;
    
//     //CONSTRUCTOR
//     public Factura(){

//     }

//     public Factura(int id_factura, Usuario usuario, Orden_compra orden_compra, Articulo_carrito articulo_carrito,
//             int num_Factura, Date fecha_factura, float subtotal_sinIVA) {
//         this.id_factura = id_factura;
//         this.usuario = usuario;
//         this.orden_compra = orden_compra;
//         this.articulo_carrito = articulo_carrito;
//         this.num_Factura = num_Factura;
//         this.fecha_factura = fecha_factura;
//         this.subtotal_sinIVA = subtotal_sinIVA;
//     }

//     public int getId_factura() {
//         return id_factura;
//     }

//     public void setId_factura(int id_factura) {
//         this.id_factura = id_factura;
//     }

//     public Usuario getUsuario() {
//         return usuario;
//     }

//     public void setUsuario(Usuario usuario) {
//         this.usuario = usuario;
//     }

//     public Orden_compra getOrden_compra() {
//         return orden_compra;
//     }

//     public void setOrden_compra(Orden_compra orden_compra) {
//         this.orden_compra = orden_compra;
//     }

//     public Articulo_carrito getArticulo_carrito() {
//         return articulo_carrito;
//     }

//     public void setArticulo_carrito(Articulo_carrito articulo_carrito) {
//         this.articulo_carrito = articulo_carrito;
//     }

//     public int getNum_Factura() {
//         return num_Factura;
//     }

//     public void setNum_Factura(int num_Factura) {
//         this.num_Factura = num_Factura;
//     }

//     public Date getFecha_factura() {
//         return fecha_factura;
//     }

//     public void setFecha_factura(Date fecha_factura) {
//         this.fecha_factura = fecha_factura;
//     }

//     public float getSubtotal_sinIVA() {
//         return subtotal_sinIVA;
//     }

//     public void setSubtotal_sinIVA(float subtotal_sinIVA) {
//         this.subtotal_sinIVA = subtotal_sinIVA;
//     }

    

// }