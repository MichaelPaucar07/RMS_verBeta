// package com.aliencode.rms_backend.CapaDatos.Entity;


// import java.util.List;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import javax.persistence.*;
// @Entity
// @Table(name = "Direccion")
// public class Direccion {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id_direccion;

//     @ManyToOne
//     @JoinColumn(name = "id_pais", nullable =false)
// 	private Pais pais;

//     @Column(name = "provincia", nullable = false , length = 50)
//     private String provincia;
//     @Column(name = "cuidad", nullable = false , length = 50)
//     private String cuidad;
//     @Column(name = "codigo_postal", nullable = false)
//     private int codigo_postal;
//     @Column(name = "calle_principal", nullable = false , length = 50)
//     private String calle_principal;
//     @Column(name = "calle_secundaria", nullable = false , length = 50)
//     private String calle_secundaria;

//     @JsonIgnore
//     @OneToMany(mappedBy = "direccion", cascade = CascadeType.ALL)
//     private List<Usuario> usuario;
    
//     @JsonIgnore
//     @OneToOne(mappedBy = "direccion", cascade = CascadeType.ALL)
//     private Orden_compra orden_compra;

//     //CONSTRUCTOR
//     public Direccion(){

//     }

//     public Direccion(int id_direccion, Pais pais, String provincia, String cuidad, int codigo_postal,
//             String calle_principal, String calle_secundaria, List<Usuario> usuario, Orden_compra orden_compra) {
//         this.id_direccion = id_direccion;
//         this.pais = pais;
//         this.provincia = provincia;
//         this.cuidad = cuidad;
//         this.codigo_postal = codigo_postal;
//         this.calle_principal = calle_principal;
//         this.calle_secundaria = calle_secundaria;
//         this.usuario = usuario;
//         this.orden_compra = orden_compra;
//     }

//     public int getId_direccion() {
//         return id_direccion;
//     }

//     public void setId_direccion(int id_direccion) {
//         this.id_direccion = id_direccion;
//     }

//     public Pais getPais() {
//         return pais;
//     }

//     public void setPais(Pais pais) {
//         this.pais = pais;
//     }

//     public String getProvincia() {
//         return provincia;
//     }

//     public void setProvincia(String provincia) {
//         this.provincia = provincia;
//     }

//     public String getCuidad() {
//         return cuidad;
//     }

//     public void setCuidad(String cuidad) {
//         this.cuidad = cuidad;
//     }

//     public int getCodigo_postal() {
//         return codigo_postal;
//     }

//     public void setCodigo_postal(int codigo_postal) {
//         this.codigo_postal = codigo_postal;
//     }

//     public String getCalle_principal() {
//         return calle_principal;
//     }

//     public void setCalle_principal(String calle_principal) {
//         this.calle_principal = calle_principal;
//     }

//     public String getCalle_secundaria() {
//         return calle_secundaria;
//     }

//     public void setCalle_secundaria(String calle_secundaria) {
//         this.calle_secundaria = calle_secundaria;
//     }

//     public List<Usuario> getUsuario() {
//         return usuario;
//     }

//     public void setUsuario(List<Usuario> usuario) {
//         this.usuario = usuario;
//     }

//     public Orden_compra getOrden_compra() {
//         return orden_compra;
//     }

//     public void setOrden_compra(Orden_compra orden_compra) {
//         this.orden_compra = orden_compra;
//     }

    
// }