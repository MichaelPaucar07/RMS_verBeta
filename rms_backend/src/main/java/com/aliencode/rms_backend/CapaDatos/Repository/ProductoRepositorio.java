// package com.aliencode.rms_backend.CapaDatos.Repository;

// import java.util.List;
// import org.springframework.data.jpa.repository.JpaRepository;
// import com.aliencode.rms_backend.CapaDatos.Entity.Categoria_producto;
// import com.aliencode.rms_backend.CapaDatos.Entity.Producto;

// public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
//     List<Producto> findByCategoria(Categoria_producto categoria_producto);

//     List<Producto> findByActivo(Boolean estado);

//     List<Producto> findByCategoriaAndActivo(Categoria_producto categoria_producto,Boolean estado);
// }