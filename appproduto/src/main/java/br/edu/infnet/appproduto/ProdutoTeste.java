package br.edu.infnet.appproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Produto;

@Component
public class ProdutoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Produto p1 = new Produto();		
		p1.codigo = 12; 
		p1.nome = "Tv Samsung";
		p1.valor = 2000;
		System.out.println("Produto - " + p1);
		
		Produto p2 = new Produto();		
		p2.codigo = 144; 
		p2.nome = "Geladeira";
		p2.valor = 1500;
		System.out.println("Produto - " + p2);
		
		Produto p3 = new Produto();		
		p3.codigo = 345; 
		p3.nome = "Notebook dell";
		p3.valor = 5000;
		System.out.println("Produto - " + p3);
	}
}