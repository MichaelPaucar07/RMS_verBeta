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
    nombre:'',
    descripcion:'',
    cantidad_stock:'',
    imagen:'',
    estado:'',
    precio:'',
    tipo:'',
    categoria:{
      id_categoria:''
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

  guardarProducto(){
    console.log(this.productosData);
    if(this.productosData.nombre.trim() == '' || this.productosData.nombre == null){
      this.snack.open('El nombre es requerido','',{
        duration:3000
      });
      return ;
    }

    this.productoService.agregarProducto(this.productosData).subscribe(
      (data) => {
        console.log(data);
        Swal.fire('producto guardado','El producto ha sido guardado con éxito','success');
        this.productosData = {
          nombre:'',
          descripcion:'',
          cantidad_stock:'',
          imagen:'',
          precio:'',
          tipo:'',
          estado:'',
          categoria:{
            id_categoria:''
          }

        }
        this.router.navigate(['/admin/view-productos']);
      },
      (error) => {
        Swal.fire('Error','Error al guardar el producto','error');
      }
    )
    
  }

  mostrarPrevisualizacion() {
    // Actualizar la vista previa de la imagen
    this.productosData.imagen = this.productosData.imagen.trim();
  }
}
