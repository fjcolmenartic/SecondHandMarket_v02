package com.openwebinars.SecondHandMarket.repositorios;

import com.openwebinars.SecondHandMarket.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Buscar usuario por su email
}
