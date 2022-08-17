package com.openwebinars.SecondHandMarket.repositorios;

import com.openwebinars.SecondHandMarket.modelo.Compra;
import com.openwebinars.SecondHandMarket.modelo.Producto;
import com.openwebinars.SecondHandMarket.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Buscar prods x usuario, x det compra, cuales no comprados, no comprados match busqueda, y buscador para usuario

    List<Producto> findByPropietario(Usuario propietario);

    List<Producto> findByCompra(Compra compra);

    List<Producto> findByCompraIsNull();

    List<Producto> findByNombreContainsIgnoreCaseAndCompraIsNull(String nombre);

    List<Producto> findByNombreContainsIgnoreCaseAndPropietario(String nombre, Usuario propietario);

}
