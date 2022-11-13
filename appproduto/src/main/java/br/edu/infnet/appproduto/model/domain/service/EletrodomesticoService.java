package br.edu.infnet.appproduto.model.domain.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appproduto.model.domain.Eletrodomestico;
import br.edu.infnet.appproduto.model.domain.repository.EletrodomesticoRepository;

@Service
public class EletrodomesticoService {
	
	@Autowired
	private EletrodomesticoRepository repository;

	public void incluir(Eletrodomestico eletrodomestico) {
		repository.save(eletrodomestico);		
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Eletrodomestico> obterLista(){
		return (Collection<Eletrodomestico>) repository.findAll();
	}		

}
