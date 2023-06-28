// package com.aliencode.rms_backend.CapaDatos.Entity;


// import javax.persistence.*;

// @Entity
// @Table(name = "Opinion_usuario")
// public class Opinion_usuario {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id_opinion_usuario;

//     @OneToOne
//     @JoinColumn(name = "id", nullable =false)
//     private Usuario usuario;

//     @OneToOne
//     @JoinColumn(name = "id_orden_compra", nullable =false)
//     private Orden_compra orden_compra;

//     @Column(name = "valor",nullable = false)
//     private int valor;
//     @Column(name = "tomentario", nullable = false , length = 50)
//     private String comentario;

//     //CONSTRUCTOR
//     public Opinion_usuario(){

//     }

//     public Opinion_usuario(int id_opinion_usuario, Usuario usuario, Orden_compra orden_compra, int valor,
//             String comentario) {
//         this.id_opinion_usuario = id_opinion_usuario;
//         this.usuario = usuario;
//         this.orden_compra = orden_compra;
//         this.valor = valor;
//         this.comentario = comentario;
//     }

//     public int getId_opinion_usuario() {
//         return id_opinion_usuario;
//     }

//     public void setId_opinion_usuario(int id_opinion_usuario) {
//         this.id_opinion_usuario = id_opinion_usuario;
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

//     public int getValor() {
//         return valor;
//     }

//     public void setValor(int valor) {
//         this.valor = valor;
//     }

//     public String getComentario() {
//         return comentario;
//     }

//     public void setComentario(String comentario) {
//         this.comentario = comentario;
//     }

// }