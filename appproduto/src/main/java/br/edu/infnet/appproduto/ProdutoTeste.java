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
		p1.setCodigo(12); 
		p1.setNome("Tv Samsung");
		p1.setValor(2000);
		System.out.println("Produto - " + p1);
		
		Produto p2 = new Produto();	
		p2.setCodigo(144); 
		p2.setNome("Geladeira");
		p2.setValor(1500);	
		System.out.println("Produto - " + p2);
		
		Produto p3 = new Produto();		
		p3.setCodigo(345); 
		p3.setNome("Notebook dell");
		p3.setValor(5000);
		System.out.println("Produto - " + p3);
	}
}