import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import { CategoriaService } from 'src/app/services/categoria/categoria.service';
import { ProductoService } from 'src/app/services/producto/producto.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-edit-producto',
  templateUrl: './edit-producto.component.html',
  styleUrls: ['./edit-producto.component.css']
})
export class EditProductoComponent implements OnInit {
  categorias: any = [];

  productoData: any = {
    nombre: '',
    descripcion: '',
    cantidad_stock: '',
    imagen: '',
    estado: '',
    precio: '',
    tipo: '',
    categoria: {
      id_categoria: ''
    }
  };

  constructor(
    private categoriaService: CategoriaService,
    private snack: MatSnackBar,
    private productoService: ProductoService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit():void{
    // Obtener el id del producto desde la URL
    const idProducto = this.route.snapshot.params['id_producto'];

    // Obtener los datos del producto mediante el servicio
    this.productoService.listarProducto(idProducto).subscribe(
      (data: any) => {
        // Asignar los valores al objeto productoData para mostrarlos en el formulario
        this.productoData = data;
      },
      (error) => {
        console.log(error);
        Swal.fire('Error !!', 'Error al cargar los datos', 'error');
      }
    );

    // Obtener las categorías para el select
    this.categoriaService.listarCategorias().subscribe(
      (dato: any) => {
        this.categorias = dato;
        console.log(this.categorias);
      },
      (error) => {
        console.log(error);
        Swal.fire('Error !!', 'Error al cargar los datos', 'error');
      }
    );
  }


  guardarProducto() {
    if (this.productoData.nombre.trim() === '' || this.productoData.nombre === null) {
      this.snack.open('El nombre es requerido', '', {
        duration: 3000
      });
      return;
    }

    this.productoService.agregarProducto(this.productoData).subscribe(
      (data) => {
        console.log(data);
        Swal.fire('Producto actualizado', 'El producto ha sido actualizado con éxito', 'success');
        this.router.navigate(['/admin/view-productos']);
      },
      (error) => {
        Swal.fire('Error', 'Error al actualizar el producto', 'error');
      }
    );
  }

  mostrarPrevisualizacion() {
     // Actualizar la vista previa de la imagen
     this.productoData.imagen = this.productoData.imagen.trim();
  }
}