import { Component, OnInit } from '@angular/core';
import { ProductoService } from 'src/app/services/producto/producto.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-view-productos',
  templateUrl: './view-productos.component.html',
  styleUrls: ['./view-productos.component.css']
})
export class ViewProductosComponent implements OnInit{
  productos : any = [

  ]

  constructor(private productoService:ProductoService) { }

  ngOnInit(): void {
    this.productoService.listarProductos().subscribe(
      (dato:any) => {
        this.productos = dato;
        console.log(this.productos);
      },
      (error) => {
        console.log(error);
        Swal.fire('Error','Error al cargar los productos','error');
      }
    )
    
  }

  // eliminarExamen(examenId:any){
  //   Swal.fire({
  //     title:'Eliminar examen',
  //     text:'¿Estás seguro de eliminar el examen?',
  //     icon:'warning',
  //     showCancelButton:true,
  //     confirmButtonColor:'#3085d6',
  //     cancelButtonColor:'#d33',
  //     confirmButtonText:'Eliminar',
  //     cancelButtonText:'Cancelar'
  //   }).then((result) => {
  //     if(result.isConfirmed){
  //       this.examenService.eliminarExamen(examenId).subscribe(
  //         (data) => {
  //           this.examenes = this.examenes.filter((examen:any) => examen.examenId != examenId);
  //           Swal.fire('Examen eliminado','El examen ha sido eliminado de la base de datos','success');
  //         },
  //         (error) => {
  //           Swal.fire('Error','Error al eliminar el examen','error');
  //         }
  //       )
  //     }
  //   })
  // }
}
