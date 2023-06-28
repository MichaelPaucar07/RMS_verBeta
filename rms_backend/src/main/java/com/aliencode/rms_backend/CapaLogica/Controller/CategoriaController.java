// package com.aliencode.rms_backend.CapaLogica.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.aliencode.rms_backend.CapaDatos.Entity.Categoria_producto;
// import com.aliencode.rms_backend.CapaDatos.Service.Categoria.CategoriaService;

// @RestController
// @RequestMapping("/categoria")
// @CrossOrigin("*")
// public class CategoriaController {
    
//     @Autowired
//     private CategoriaService categoriaService;

//     @PostMapping("/")
//     public ResponseEntity<Categoria_producto> guardarCategoria(@RequestBody Categoria_producto categoria){
//         Categoria_producto categoriaGuardada = categoriaService.agregarCategoria(categoria);
//         return ResponseEntity.ok(categoriaGuardada);
//     }

//     // @GetMapping("/{id_categoria_producto}")
//     // public Categoria_producto listarCategoriaPorId(@PathVariable("id_categoria_producto") Integer id_categoria_producto){
//     //     return categoriaService.obtenerCategoria(id_categoria_producto);
//     // }

//     @GetMapping("/")
//     public ResponseEntity<?> listarCategorias(){
//         return ResponseEntity.ok(categoriaService.obtenerCategoria());
//     }

//     // @PutMapping("/")
//     // public Categoria_producto actualizarCategoria(@RequestBody Categoria_producto categoria){
//     //     return categoriaService.actualizarCategoria(categoria);
//     // }

//     @DeleteMapping("/{categoriaId}")
//     public void eliminarCategoria(@PathVariable("categoriaId") Integer id_categoria_producto){
//         categoriaService.eliminarCategoria(id_categoria_producto);
//     }
// }
