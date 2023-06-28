// package com.aliencode.rms_backend.CapaDatos.Entity;


// import java.sql.Date;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import javax.persistence.*;

// @Entity
// @Table(name = "Orden_compra")
// public class Orden_compra {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id_orden_compra;

//     @ManyToOne
//     @JoinColumn(name = "id", nullable =false)
//     private Usuario usuario;

//     @OneToOne
//     @JoinColumn(name="id_metodo_pago", nullable =false)
//     private Metodo_pago metodo_pago;

//     @OneToOne
//     @JoinColumn(name="id_direccion", nullable =false)
//     private Direccion direccion;

//     @ManyToOne
//     @JoinColumn(name = "id_metodo_envio", nullable =false)
//     private Metodo_envio metodo_envio;

//     @ManyToOne
//     @JoinColumn(name = "id_estado_orden", nullable =false)
//     private Estado_orden estado_orden;

//     @Column(name = "fecha_orden",nullable = false)
//     private Date fecha_orden;
    
//     @Column(name = "total_orden",nullable = false)
//     private float total_orden;

//     @JsonIgnore
//     @OneToOne(mappedBy = "orden_compra",cascade = CascadeType.ALL)
//     private Opinion_usuario opinion_usuario;
    
//     @JsonIgnore
//     @OneToOne(mappedBy = "orden_compra",cascade = CascadeType.ALL)
//     private Factura facturas;
    
//     //CONSTRUCTOR
//     public Orden_compra(){

//     }

//     public Orden_compra(int id_orden_compra, Usuario usuario, Metodo_pago metodo_pago, Direccion direccion,
//             Metodo_envio metodo_envio, Estado_orden estado_orden, Date fecha_orden, float total_orden,
//             Opinion_usuario opinion_usuario, Factura facturas) {
//         this.id_orden_compra = id_orden_compra;
//         this.usuario = usuario;
//         this.metodo_pago = metodo_pago;
//         this.direccion = direccion;
//         this.metodo_envio = metodo_envio;
//         this.estado_orden = estado_orden;
//         this.fecha_orden = fecha_orden;
//         this.total_orden = total_orden;
//         this.opinion_usuario = opinion_usuario;
//         this.facturas = facturas;
//     }

//     public int getId_orden_compra() {
//         return id_orden_compra;
//     }

//     public void setId_orden_compra(int id_orden_compra) {
//         this.id_orden_compra = id_orden_compra;
//     }

//     public Usuario getUsuario() {
//         return usuario;
//     }

//     public void setUsuario(Usuario usuario) {
//         this.usuario = usuario;
//     }

//     public Metodo_pago getMetodo_pago() {
//         return metodo_pago;
//     }

//     public void setMetodo_pago(Metodo_pago metodo_pago) {
//         this.metodo_pago = metodo_pago;
//     }

//     public Direccion getDireccion() {
//         return direccion;
//     }

//     public void setDireccion(Direccion direccion) {
//         this.direccion = direccion;
//     }

//     public Metodo_envio getMetodo_envio() {
//         return metodo_envio;
//     }

//     public void setMetodo_envio(Metodo_envio metodo_envio) {
//         this.metodo_envio = metodo_envio;
//     }

//     public Estado_orden getEstado_orden() {
//         return estado_orden;
//     }

//     public void setEstado_orden(Estado_orden estado_orden) {
//         this.estado_orden = estado_orden;
//     }

//     public Date getFecha_orden() {
//         return fecha_orden;
//     }

//     public void setFecha_orden(Date fecha_orden) {
//         this.fecha_orden = fecha_orden;
//     }

//     public float getTotal_orden() {
//         return total_orden;
//     }

//     public void setTotal_orden(float total_orden) {
//         this.total_orden = total_orden;
//     }

//     public Opinion_usuario getOpinion_usuario() {
//         return opinion_usuario;
//     }

//     public void setOpinion_usuario(Opinion_usuario opinion_usuario) {
//         this.opinion_usuario = opinion_usuario;
//     }

//     public Factura getFacturas() {
//         return facturas;
//     }

//     public void setFacturas(Factura facturas) {
//         this.facturas = facturas;
//     }

    
// }