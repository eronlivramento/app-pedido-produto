package br.edu.infnet.appproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Escritorio;

@Component
public class EscritorioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Escritorio b1 = new Escritorio();		
		b1.setFragil(false);
		b1.setDescricao("Mesa de escritorio");
		b1.setTamanho(3.50f);
		System.out.println("Escritorio - " + b1);
		
		Escritorio b2 = new Escritorio();	
		b2.setFragil(true);
		b2.setDescricao("Sofa cama");
		b2.setTamanho(1.5f);
		System.out.println("Escritorio - " + b2);
		
		Escritorio b3 = new Escritorio();	
		b3.setFragil(false);
		b3.setDescricao("Cama box");
		b3.setTamanho(2);
		System.out.println("Escritorio - " + b3);
	}
}