package com.openwebinars.SecondHandMarket.repositorios;

import com.openwebinars.SecondHandMarket.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Buscar prods x usuario, x det compra, cuales no comprados, no comprados match busqueda, y buscador para usuario
}
