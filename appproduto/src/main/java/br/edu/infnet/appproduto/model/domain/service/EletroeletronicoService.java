package br.edu.infnet.appproduto.model.domain.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appproduto.model.domain.Eletroeletronico;
import br.edu.infnet.appproduto.model.domain.repository.EletroeletronicoRepository;

@Service
public class EletroeletronicoService {
	
	@Autowired
	private EletroeletronicoRepository repository;

	public void incluir(Eletroeletronico eletroeletronico) {
		repository.save(eletroeletronico);		
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Eletroeletronico> obterLista(){
		return (Collection<Eletroeletronico>) repository.findAll();
	}		

}
