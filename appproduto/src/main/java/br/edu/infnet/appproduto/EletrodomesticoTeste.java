package br.edu.infnet.appproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Eletrodomestico;

@Component
public class EletrodomesticoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Eletrodomestico s1 = new Eletrodomestico();		
		s1.setGarantiaEstendida(true);
		s1.setDescricao("Batedeira Philco 4000");
		s1.setQuantidade(1);
		System.out.println("Eletrodomestico - " + s1);
		
		Eletrodomestico s2 = new Eletrodomestico();		
		s2.setGarantiaEstendida(false);
		s2.setDescricao("Maquina de lavar brastemp");
		s2.setQuantidade(2);	
		System.out.println("Eletrodomestico - " + s2);
		
		Eletrodomestico s3 = new Eletrodomestico();		
		s3.setGarantiaEstendida(true);
		s3.setDescricao("Tv 4k Samsung");
		s3.setQuantidade(3);	
		System.out.println("Eletrodomestico - " + s3);
	}
}