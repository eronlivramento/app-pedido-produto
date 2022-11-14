package br.edu.infnet.appproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Eletrodomestico;
import br.edu.infnet.appproduto.model.domain.Eletroeletronico;
import br.edu.infnet.appproduto.model.domain.Produto;
import br.edu.infnet.appproduto.model.domain.service.ProdutoService;

@Order(4)
@Component
public class ProdutoTeste implements ApplicationRunner {
	
	@Autowired
	private ProdutoService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Produto p1 = new Eletrodomestico();		
		p1.setCodigo(12); 
		p1.setNome("Tv Samsung");
		p1.setValor(2000);
		service.incluir(p1);
		
		Produto p2 = new Eletrodomestico();	
		p2.setCodigo(144); 
		p2.setNome("Geladeira");
		p2.setValor(1500);	
		service.incluir(p2);
		
		Produto p3 = new Eletroeletronico();		
		p3.setCodigo(345); 
		p3.setNome("Notebook dell");
		p3.setValor(5000);
		service.incluir(p2);
	}
}