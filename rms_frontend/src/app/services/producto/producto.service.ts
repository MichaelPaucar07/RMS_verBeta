import { Injectable } from '@angular/core';
import baseUrl from '../helper';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  constructor(private http:HttpClient) { }

  public listarProductos(){
    return this.http.get(`${baseUrl}/producto/`);
  }

  public agregarProducto(producto:any){
    return this.http.post(`${baseUrl}/producto/`,producto);
  }

  public eliminarProducto(id_producto:any){
    return this.http.delete(`${baseUrl}/producto/${id_producto}`);
  }

  public listarProducto(id_producto:any){
    return this.http.get(`${baseUrl}/producto/${id_producto}`);
  }

  public actualizarProducto(producto:any){
    return this.http.put(`${baseUrl}/producto/`,producto);
  }

  public listarProductosDeUnaCategoria(id_categoria:any){
    return this.http.get(`${baseUrl}/producto/categoria/${id_categoria}`);
  }

  public listarProductosActivos(){
    return this.http.get(`${baseUrl}/produtco/activo`);
  }

  public listarExamenesActivosDeUnaCategoria(id_categoria:any){
    return this.http.get(`${baseUrl}/producto/categoria/activo/${id_categoria}`);
  }
}
