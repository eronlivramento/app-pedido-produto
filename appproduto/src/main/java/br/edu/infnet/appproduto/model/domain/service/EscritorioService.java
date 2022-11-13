package br.edu.infnet.appproduto.model.domain.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appproduto.model.domain.Escritorio;
import br.edu.infnet.appproduto.model.domain.repository.EscritorioRepository;

@Service
public class EscritorioService {
	
	@Autowired
	private EscritorioRepository repository;

	public void incluir(Escritorio escritorio) {
		repository.save(escritorio);		
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Escritorio> obterLista(){
		return (Collection<Escritorio>) repository.findAll();
	}		
}
