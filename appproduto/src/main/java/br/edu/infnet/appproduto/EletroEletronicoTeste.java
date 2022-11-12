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
		c1.setDescricao("DVD carro Philco");
		c1.setFragil(false);
		c1.setGarantiaEstendida(false);
		System.out.println("EletroEletronico - " + c1);
		
		EletroEletronico c2 = new EletroEletronico();
		c2.setDescricao("Computador de mesa");
		c2.setFragil(true);
		c2.setGarantiaEstendida(true);
		System.out.println("EletroEletronico - " + c2);
		
		EletroEletronico c3 = new EletroEletronico();
		c3.setDescricao("Notebook dell");
		c3.setFragil(true);
		c3.setGarantiaEstendida(true);
		System.out.println("EletroEletronico - " + c3);
	}
}