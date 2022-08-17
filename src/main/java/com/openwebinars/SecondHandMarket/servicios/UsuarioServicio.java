package com.openwebinars.SecondHandMarket.servicios;

import com.openwebinars.SecondHandMarket.modelo.Usuario;
import com.openwebinars.SecondHandMarket.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepository repositorio;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public Usuario registrar(Usuario u) {
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        return  repositorio.save(u);
    }

    public Usuario findById(long id) {
        return repositorio.findById(id).orElse(null);
    }

    public Usuario buscarPorEmail(String email) {
        return repositorio.findFirstByEmail(email);
    }

}
