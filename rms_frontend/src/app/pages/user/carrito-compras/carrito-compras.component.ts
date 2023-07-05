import { Component, OnInit } from '@angular/core';
import { ProductoService } from 'src/app/services/producto/producto.service';

@Component({
  selector: 'app-carrito-compras',
  templateUrl: './carrito-compras.component.html',
  styleUrls: ['./carrito-compras.component.css']
})
export class CarritoComprasComponent implements OnInit {
  productos: any[] = [];

  constructor(private productoService: ProductoService) { }

  ngOnInit(): void {
//     this.obtenerProductosEnCarrito();
}

//   obtenerProductosEnCarrito(): void {
//     // Llama al método del servicio para obtener los productos en el carrito
//     // Por ejemplo, supongamos que el servicio tiene un método `obtenerProductosEnCarrito()`
//     this.productoService.obtenerProductosEnCarrito().subscribe((productos: any[]) => {
//       this.productos = productos;
//     });
//   }

//   eliminarProducto(idProducto: any): void {
//     // Llama al método del servicio para eliminar un producto del carrito
//     // Por ejemplo, supongamos que el servicio tiene un método `eliminarProducto(idProducto)`
//     this.productoService.eliminarProducto(idProducto).subscribe(() => {
//       this.obtenerProductosEnCarrito();
//     });
//   }

//   calcularTotalCompra(): number {
//     let total = 0;

//     for (const producto of this.productos) {
//       total += producto.precio * producto.cantidad;
//     }

//     return total;
//   }

//   realizarCompra(): void {
//     // Aquí puedes agregar la lógica para realizar la compra
//     // Por ejemplo, puedes mostrar un mensaje de éxito y reiniciar el carrito
//   }
}