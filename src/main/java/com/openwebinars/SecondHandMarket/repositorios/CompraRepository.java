package com.openwebinars.SecondHandMarket.repositorios;

import com.openwebinars.SecondHandMarket.modelo.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    // metdoo consulta de compras de un det usuario
}
