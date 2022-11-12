package br.edu.infnet.appproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.controller.EscritorioController;
import br.edu.infnet.appproduto.model.domain.Escritorio;

@Order(3)
@Component
public class EscritorioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Escritorio b1 = new Escritorio();		
		b1.setFragil(false);
		b1.setDescricao("Mesa de escritorio");
		b1.setTamanho(3.50f);
		EscritorioController.incluir(b1);
		
		Escritorio b2 = new Escritorio();	
		b2.setFragil(true);
		b2.setDescricao("Sofa cama");
		b2.setTamanho(1.5f);
		EscritorioController.incluir(b2);
		
		Escritorio b3 = new Escritorio();	
		b3.setFragil(false);
		b3.setDescricao("Cama box");
		b3.setTamanho(2);
		EscritorioController.incluir(b3);
	}
}