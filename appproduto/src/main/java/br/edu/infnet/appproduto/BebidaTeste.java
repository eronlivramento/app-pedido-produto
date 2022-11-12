package br.edu.infnet.appproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Escritorio;

@Component
public class BebidaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Escritorio b1 = new Escritorio();		
		b1.fragil = false;
		b1.descricao = "Mesa de escritorio";
		b1.tamanho = 3.50f;
		System.out.println("Escritorio - " + b1);
		
		Escritorio b2 = new Escritorio();
		b2.fragil = true;
		b2.descricao = "Sofa cama";
		b2.tamanho = 1.5f;
		System.out.println("Escritorio - " + b2);
		
		Escritorio b3 = new Escritorio();
		b3.fragil = true;
		b3.descricao = "Cama box";
		b3.tamanho = 2;
		System.out.println("Escritorio - " + b3);
	}
}