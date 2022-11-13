package br.edu.infnet.appproduto.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appproduto.model.domain.Eletroeletronico;

@Repository
public interface EletroeletronicoRepository extends CrudRepository<Eletroeletronico, Integer>{

}
