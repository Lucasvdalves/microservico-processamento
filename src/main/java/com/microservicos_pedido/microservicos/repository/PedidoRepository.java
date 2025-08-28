package com.microservicos_pedido.microservicos.repository;

import com.microservicos_pedido.microservicos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}



