package com.microservicos_pedido.microservicos.repository;

import com.microservicos_pedido.microservicos.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
