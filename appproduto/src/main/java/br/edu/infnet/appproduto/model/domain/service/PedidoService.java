package br.edu.infnet.appproduto.model.domain.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appproduto.model.domain.Pedido;
import br.edu.infnet.appproduto.model.domain.Usuario;
import br.edu.infnet.appproduto.model.domain.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;

	public void incluir(Pedido pedido) {
		repository.save(pedido);		
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Pedido> obterLista(){
		return (Collection<Pedido>) repository.findAll();
	}	
	
	public Collection<Pedido> obterLista(Usuario usuario){
		return (Collection<Pedido>) repository.obterLista(usuario.getId());
	}	

}
