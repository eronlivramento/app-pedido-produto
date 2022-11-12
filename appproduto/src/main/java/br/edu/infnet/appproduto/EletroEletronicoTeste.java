package br.edu.infnet.appproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.controller.EletroEletronicoController;
import br.edu.infnet.appproduto.model.domain.Eletroeletronico;

@Order(4)
@Component
public class EletroEletronicoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Eletroeletronico c1 = new Eletroeletronico();		
		c1.setDescricao("DVD carro Philco");
		c1.setFragil(false);
		c1.setGarantiaEstendida(false);
		EletroEletronicoController.incluir(c1);
		
		Eletroeletronico c2 = new Eletroeletronico();
		c2.setDescricao("Computador de mesa");
		c2.setFragil(true);
		c2.setGarantiaEstendida(true);
		EletroEletronicoController.incluir(c2);
		
		Eletroeletronico c3 = new Eletroeletronico();
		c3.setDescricao("Notebook dell");
		c3.setFragil(true);
		c3.setGarantiaEstendida(true);
		EletroEletronicoController.incluir(c3);
	}
}