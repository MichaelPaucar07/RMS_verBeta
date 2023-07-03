import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { CategoriaService } from 'src/app/services/categoria/categoria.service';
import { ProductoService } from 'src/app/services/producto/producto.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-add-producto',
  templateUrl: './add-producto.component.html',
  styleUrls: ['./add-producto.component.css']
})
export class AddProductoComponent implements OnInit {

  categorias:any = [];

  productosData = {
    titulo:'',
    descripcion:'',
    puntosMaximos:'',
    numeroDePreguntas:'',
    activo:true,
    categoria:{
      categoriaId:''
    }
  }

  constructor(
    private categoriaService:CategoriaService,
    private snack:MatSnackBar,
    private productoService:ProductoService,
    private router:Router) { }

  ngOnInit(): void {
    this.categoriaService.listarCategorias().subscribe(
      (dato:any) => {
        this.categorias = dato;
        console.log(this.categorias);
      },(error) => {
        console.log(error);
        Swal.fire('Error !!','Error al cargar los datos','error');
      }
    )
  }

  // guardarCuestionario(){
  //   console.log(this.examenData);
  //   if(this.examenData.titulo.trim() == '' || this.examenData.titulo == null){
  //     this.snack.open('El título es requerido','',{
  //       duration:3000
  //     });
  //     return ;
  //   }

  //   this.examenService.agregarExamen(this.examenData).subscribe(
  //     (data) => {
  //       console.log(data);
  //       Swal.fire('Examen guardado','El examen ha sido guardado con éxito','success');
  //       this.examenData = {
  //         titulo : '',
  //         descripcion : '',
  //         puntosMaximos : '',
  //         numeroDePreguntas : '',
  //         activo:true,
  //         categoria:{
  //           categoriaId:''
  //         }
  //       }
  //       this.router.navigate(['/admin/examenes']);
  //     },
  //     (error) => {
  //       Swal.fire('Error','Error al guardar el examen','error');
  //     }
  //   )
  // }

}
