package br.edu.infnet.appproduto.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appproduto.model.domain.Pedido;

@Repository
public interface PedidoRepository  extends CrudRepository<Pedido, Integer>{

}
