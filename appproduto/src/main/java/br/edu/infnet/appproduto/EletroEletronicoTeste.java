package br.edu.infnet.appproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.EletroEletronico;

@Component
public class EletroEletronicoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		EletroEletronico c1 = new EletroEletronico();		
		c1.descricao = "DVD carro Philco";
		c1.fragil = false;
		c1.garantiaEstendida = false;
		System.out.println("EletroEletronico - " + c1);
		
		EletroEletronico c2 = new EletroEletronico();
		c2.descricao = "Computador de mesa";
		c2.fragil = true;
		c2.garantiaEstendida = true;
		System.out.println("EletroEletronico - " + c2);
		
		EletroEletronico c3 = new EletroEletronico();
		c3.descricao = "Notebook dell";
		c3.fragil = true;
		c3.garantiaEstendida = true;
		System.out.println("EletroEletronico - " + c3);
	}
}