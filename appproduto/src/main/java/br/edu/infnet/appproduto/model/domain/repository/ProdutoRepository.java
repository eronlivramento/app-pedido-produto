package br.edu.infnet.appproduto.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appproduto.model.domain.Produto;

@Repository
public interface ProdutoRepository  extends CrudRepository<Produto, Integer> {

}
