package br.edu.infnet.appproduto.model.domain.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appproduto.model.domain.Cliente;
import br.edu.infnet.appproduto.model.domain.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	public void incluir(Cliente cliente) {
		repository.save(cliente);		
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Cliente> obterLista(){
		return (Collection<Cliente>) repository.findAll();
	}		
}
