package com.aliencode.rms_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* 
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.aliencode.rms_backend.CapaDatos.Entity.Rol;
import com.aliencode.rms_backend.CapaDatos.Entity.Usuario;
import com.aliencode.rms_backend.CapaDatos.Entity.UsuarioRol;
import com.aliencode.rms_backend.CapaDatos.Service.Usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;*/

@SpringBootApplication
public class RmsBackendApplication implements CommandLineRunner{

	/* 
	//INYECCION 
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;*/

	public static void main(String[] args) {
		SpringApplication.run(RmsBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* 
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		String fechaNacimiento = "07/11/1999"; 

		try{
			Usuario usuario = new Usuario();
			
			usuario.setUsername("michael");
			usuario.setPassword(bCryptPasswordEncoder.encode("12345"));
			usuario.setNombres("Michael");
			usuario.setApellidos("Paucar");
			usuario.setTelefono("988212020");

			Date utilDate = formatoFecha.parse(fechaNacimiento);
    		Date sqlDate = new Date(utilDate.getTime());
   			usuario.setFecha_nac(new java.sql.Date(sqlDate.getTime()));
			
			usuario.setEmail("michael@gmail.com");
			usuario.setCedula("0504361007");
		
			Rol rol = new Rol();
			rol.setId(1);
			rol.setNombre("ADMIN");
			rol.setRol_nombre("ADMIN");

			List<UsuarioRol> usuarioRoles = new ArrayList<>();

			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuarioRoles.add(usuarioRol);

			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuarioRoles);
			System.out.println(usuarioGuardado.getUsername());

		}catch (UsuarioNotFoundException exception){
			exception.printStackTrace();
		}*/
	}

}
