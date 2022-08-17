package com.openwebinars.SecondHandMarket.repositorios;

import com.openwebinars.SecondHandMarket.modelo.Compra;
import com.openwebinars.SecondHandMarket.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    // metdoo consulta de compras de un det usuario

    List<Compra> findByPropietario(Usuario propietario);

}
