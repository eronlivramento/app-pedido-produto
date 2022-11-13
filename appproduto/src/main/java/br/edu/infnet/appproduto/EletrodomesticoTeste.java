package br.edu.infnet.appproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Eletrodomestico;
import br.edu.infnet.appproduto.model.domain.service.EletrodomesticoService;

@Order(5)
@Component
public class EletrodomesticoTeste implements ApplicationRunner {
	
	@Autowired
	private EletrodomesticoService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Eletrodomestico s1 = new Eletrodomestico();		
		s1.setGarantiaEstendida(true);
		s1.setDescricao("Batedeira Philco 4000");
		s1.setQuantidade(1);
		service.incluir(s1);
		
		Eletrodomestico s2 = new Eletrodomestico();		
		s2.setGarantiaEstendida(false);
		s2.setDescricao("Maquina de lavar brastemp");
		s2.setQuantidade(2);	
		service.incluir(s2);
		
		Eletrodomestico s3 = new Eletrodomestico();		
		s3.setGarantiaEstendida(true);
		s3.setDescricao("Tv 4k Samsung");
		s3.setQuantidade(3);	
		service.incluir(s3);
	}
}