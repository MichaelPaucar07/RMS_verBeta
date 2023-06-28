// package com.aliencode.rms_backend.CapaDatos.Entity;


// import java.util.List;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import javax.persistence.*;

// @Entity
// @Table(name = "Carrito_compra")
// public class Carrito_compra {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id_carrito_compra;

//     @JsonIgnore
//     @OneToOne
//     @JoinColumn(name="id", nullable =false)
//     private Usuario usuario;
    
//     @JsonIgnore
//     @OneToMany(mappedBy="carrito_compra", cascade = CascadeType.ALL)
//     private List<Articulo_carrito> articulo_carrito;

//     //CONSTRUCTOR
//     public Carrito_compra(){

//     }

//     public Carrito_compra(int id_carrito_compra, Usuario usuario, List<Articulo_carrito> articulo_carrito) {
//         this.id_carrito_compra = id_carrito_compra;
//         this.usuario = usuario;
//         this.articulo_carrito = articulo_carrito;
//     }

//     public int getId_carrito_compra() {
//         return id_carrito_compra;
//     }

//     public void setId_carrito_compra(int id_carrito_compra) {
//         this.id_carrito_compra = id_carrito_compra;
//     }

//     public Usuario getUsuario() {
//         return usuario;
//     }

//     public void setUsuario(Usuario usuario) {
//         this.usuario = usuario;
//     }

//     public List<Articulo_carrito> getArticulo_carrito() {
//         return articulo_carrito;
//     }

//     public void setArticulo_carrito(List<Articulo_carrito> articulo_carrito) {
//         this.articulo_carrito = articulo_carrito;
//     }

// }
