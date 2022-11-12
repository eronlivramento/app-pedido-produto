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
		s1.garantiaEstendida = true;
		s1.descricao = "Batedeira Philco 4000";
		s1.quantidade = 1;
		System.out.println("Eletrodomestico - " + s1);
		
		Eletrodomestico s2 = new Eletrodomestico();		
		s2.garantiaEstendida = false;
		s2.descricao = "Maquina de lavar brastemp";
		s2.quantidade = 2;
		System.out.println("Eletrodomestico - " + s2);
		
		Eletrodomestico s3 = new Eletrodomestico();		
		s3.garantiaEstendida = true;
		s3.descricao = "Tv 4k Samsung";
		s3.quantidade = 3;
		System.out.println("Eletrodomestico - " + s3);
	}
}