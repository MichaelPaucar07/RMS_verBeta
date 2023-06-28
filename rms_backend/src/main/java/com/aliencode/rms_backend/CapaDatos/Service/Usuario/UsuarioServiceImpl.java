package com.aliencode.rms_backend.CapaDatos.Service.Usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliencode.rms_backend.CapaDatos.Entity.Usuario;
import com.aliencode.rms_backend.CapaDatos.Entity.UsuarioRol;
import com.aliencode.rms_backend.CapaDatos.Repository.RolRepositorio;
import com.aliencode.rms_backend.CapaDatos.Repository.UsuarioRepositorio;
import com.aliencode.rms_backend.CapaLogica.Exceptions.UsuarioFoundException;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private RolRepositorio rolRepositorio;

    @Override
    public Usuario guardarUsuario(Usuario usuario, List<UsuarioRol> usuarioRoles) throws Exception {

        Usuario usuarioLocal = usuarioRepositorio.findByUsername(usuario.getUsername());
        
        //FUN GUARDAR USUARIO QUE NO ESTE REPETIDO O EXIXTENTE
        if(usuarioLocal != null){
            System.out.println("El usuario ya existe");
            throw new UsuarioFoundException("El usuario ya esta presente");
        } else{
            for(UsuarioRol usuarioRol:usuarioRoles){
                rolRepositorio.save(usuarioRol.getRol());   
            }

            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepositorio.save(usuario);
        }

        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String usernmane) {
        return usuarioRepositorio.findByUsername(usernmane);
    }

    @Override
    public void eliminarUsuario(int id) {
        usuarioRepositorio.deleteById(id);
    }
}
