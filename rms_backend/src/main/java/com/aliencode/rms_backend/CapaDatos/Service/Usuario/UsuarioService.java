package com.aliencode.rms_backend.CapaDatos.Service.Usuario;

import java.util.List;
import com.aliencode.rms_backend.CapaDatos.Entity.Usuario;
import com.aliencode.rms_backend.CapaDatos.Entity.UsuarioRol;

public interface UsuarioService{

    public Usuario guardarUsuario(Usuario usuario, List<UsuarioRol> usuarioRoles) throws Exception;
    public Usuario obtenerUsuario(String usernmae);
    public void eliminarUsuario(int id);
}
