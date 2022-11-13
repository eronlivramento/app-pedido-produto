package br.edu.infnet.appproduto.model.domain.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appproduto.model.domain.Produto;
import br.edu.infnet.appproduto.model.domain.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;

	public void incluir(Produto produto) {
		repository.save(produto);		
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Produto> obterLista(){
		return (Collection<Produto>) repository.findAll();
	}	

}
