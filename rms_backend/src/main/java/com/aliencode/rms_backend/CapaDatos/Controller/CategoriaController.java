package com.aliencode.rms_backend.CapaDatos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aliencode.rms_backend.CapaDatos.Entity.Categoria;
import com.aliencode.rms_backend.CapaDatos.Service.Categoria.CategoriaService;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/")
    public ResponseEntity<Categoria> guardarCategoria(@RequestBody Categoria categoria){
        Categoria categoriaGuardada = categoriaService.agregarCategoria(categoria);
        return ResponseEntity.ok(categoriaGuardada);
    }

    @GetMapping("/{id_categoria}")
    public Categoria listarCategoriaPorId(@PathVariable("id_categoria") Integer id_categoria){
        return categoriaService.obtenerCategoria(id_categoria);
    }

    @GetMapping("/")
    public ResponseEntity<?> listarCategorias(){
        return ResponseEntity.ok(categoriaService.obtenerCategorias());
    }

    @PutMapping("/")
    public Categoria actualizarCategoria(@RequestBody Categoria categoria){
        return categoriaService.actualizarCategoria(categoria);
    }

    @DeleteMapping("/{id_categoria}")
    public void eliminarCategoria(@PathVariable("id_categoria") Integer id_categoria){
        categoriaService.eliminarCategoria(id_categoria);
    }
}
