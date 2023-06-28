package com.aliencode.rms_backend.CapaLogica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.aliencode.rms_backend.CapaDatos.Entity.Usuario;
import com.aliencode.rms_backend.CapaLogica.Exceptions.UsuarioNotFoundException;
import com.aliencode.rms_backend.CapaLogica.Security.Config.JwtUtils;
import com.aliencode.rms_backend.CapaLogica.Security.Dto.JwtRequest;
import com.aliencode.rms_backend.CapaLogica.Security.Dto.JwtResponse;
import com.aliencode.rms_backend.CapaLogica.Security.Service.User.UserDetailsServiceImpl;
import java.security.Principal;

@RestController
@CrossOrigin("*")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/generate-token")
        public ResponseEntity<?> generarToken(@RequestBody JwtRequest jwtRequest) throws Exception {
            try {
            autenticar(jwtRequest.getUsername(), jwtRequest.getPassword());
        } catch (UsuarioNotFoundException exception) {
            exception.printStackTrace();
            throw new Exception("Usuario no encontrado");
        }

        UserDetails userDetails = this.userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void autenticar(String username,String password) throws Exception {
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
        }catch (DisabledException exception){
            throw  new Exception("USUARIO DESHABILITADO " + exception.getMessage());
        }catch (BadCredentialsException e){
            throw  new Exception("Credenciales invalidas " + e.getMessage());
        }
    }

    @GetMapping("/actual-usuario")
    public Usuario obtenerUsuarioActual(Principal principal){
        return (Usuario) this.userDetailsService.loadUserByUsername(principal.getName());
    }
}