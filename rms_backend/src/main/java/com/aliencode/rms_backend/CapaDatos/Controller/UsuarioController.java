package com.aliencode.rms_backend.CapaDatos.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.aliencode.rms_backend.CapaDatos.Entity.Rol;
import com.aliencode.rms_backend.CapaDatos.Entity.Usuario;
import com.aliencode.rms_backend.CapaDatos.Entity.UsuarioRol;
import com.aliencode.rms_backend.CapaDatos.Service.Usuario.UsuarioService;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    //INYECCCION DEL METODO CON EL PATRON
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception{
        
        //ENRIPTACION DE LA CONTRASEÑA
        usuario.setPassword(this.bCryptPasswordEncoder.encode(usuario.getPassword()));

        List<UsuarioRol> roles = new ArrayList<>();

        Rol rol = new Rol();
        rol.setId(2);
        rol.setNombre("CLIENTE");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);
        
        roles.add(usuarioRol);
        
        return usuarioService.guardarUsuario(usuario, roles);
    }

    @GetMapping("/{username}")
    public Usuario obteneUsuario(@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable("id") Integer id){
        usuarioService.eliminarUsuario(id);
    }

}
