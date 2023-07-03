package com.aliencode.rms_backend.CapaDatos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aliencode.rms_backend.CapaDatos.Entity.Detalle_carrito;
import com.aliencode.rms_backend.CapaDatos.Entity.Producto;
import com.aliencode.rms_backend.CapaDatos.Service.DetaleCarrito.DetalleCarritoService;

@RestController
@RequestMapping("/detallesCarrito")
@CrossOrigin("*")
public class DetalleCarritoControler {

    @Autowired
    private DetalleCarritoService detalleCarritoService;
    
    @PostMapping
    public ResponseEntity<Detalle_carrito> agregarDetalleCarrito(@RequestBody Detalle_carrito detalleCarrito) {
        Detalle_carrito nuevoDetalle = detalleCarritoService.agregarDetalleCarrito(detalleCarrito);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoDetalle);
    }

    @PutMapping("/{id_detalle_carrito}")
    public ResponseEntity<Detalle_carrito> actualizarDetalleCarrito(@PathVariable("id_detalle_carrito") Integer idDetalleCarrito,
                                                             @RequestBody Detalle_carrito detalleCarrito) {
        detalleCarrito.setId_detalle_carrito(idDetalleCarrito);
        Detalle_carrito detalleActualizado = detalleCarritoService.actualizarDetalleCarrito(detalleCarrito);
        return ResponseEntity.ok(detalleActualizado);
    }

    @GetMapping
    public ResponseEntity<List<Detalle_carrito>> obtenerDetalleCarritos() {
        List<Detalle_carrito> detalleCarritos = detalleCarritoService.obtenerDetalleCarritos();
        return ResponseEntity.ok(detalleCarritos);
    }

    @GetMapping("/{id_detalle_carrito}")
    public ResponseEntity<Detalle_carrito> obtenerDetalleCarrito(@PathVariable("id_detalle_carrito") Integer idDetalleCarrito) {
        Detalle_carrito detalleCarrito = detalleCarritoService.obtenerDetalleCarrito(idDetalleCarrito);
        if (detalleCarrito != null) {
            return ResponseEntity.ok(detalleCarrito);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/producto/{id_producto}")
    public ResponseEntity<List<Detalle_carrito>> obtenerDetalleCarritosDelProducto(@PathVariable("id_producto") Integer idProducto) {
        Producto producto = new Producto();
        producto.setId_producto(idProducto);
        List<Detalle_carrito> detalleCarritos = detalleCarritoService.obtenerDetalleCarritosDelProducto(producto);
        return ResponseEntity.ok(detalleCarritos);
    }

    @DeleteMapping("/{id_detalle_carrito}")
    public ResponseEntity<Void> eliminarDetalleCarrito(@PathVariable("id_detalle_carrito") Integer idDetalleCarrito) {
        detalleCarritoService.eliminarDetalleCarrito(idDetalleCarrito);
        return ResponseEntity.noContent().build();
    }
    // @Autowired
    // private DetalleCarritoService detalleCarritoService;

    // @Autowired
    // private ProductoService productoService;

    // @PostMapping("/")
    // public ResponseEntity<Detalle_carrito> agregarDetalleCarrito(@RequestBody Detalle_carrito detalle_carrito){
    //     return ResponseEntity.ok(detalleCarritoService.agregarDetalleCarrito(detalle_carrito));
    // }

    // @PutMapping("/")
    // public ResponseEntity<Detalle_carrito> actualizarDetalleCarrito(@RequestBody Detalle_carrito detalle_carrito){
    //     return ResponseEntity.ok(detalleCarritoService.actualizarDetalleCarrito(detalle_carrito));
    // }

    // @GetMapping("/productos/{id_producto}")
    // public ResponseEntity<?> listarproductoDetale(@PathVariable("id_producto") Integer id_producto){
    //    Producto producto  = productoService.obtenerProducto(id_producto);

    //    List<Producto> productos = producto.getDetalle_carritos();
    //    List productos = new ArrayList(dera)

    //     Set<Pregunta> preguntas
    //      = examen.getPreguntas();

    //     List examenes = new ArrayList(preguntas);
    //     if(examenes.size() > Integer.parseInt(examen.getNumeroDePreguntas())){
    //         examenes = examenes.subList(0,Integer.parseInt(examen.getNumeroDePreguntas() + 1));
    //     }

    //     Collections.shuffle(examenes);
    //     return ResponseEntity.ok(examenes);
    // }
}
