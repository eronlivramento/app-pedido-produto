package br.edu.infnet.appproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Cliente s1 = new Cliente();		
		s1.cpf = "12345667890";
		s1.email = "cliente@primeiro.com";
		s1.nome = "Primeiro cliente";
		System.out.println("Cliente - " + s1);
		
		Cliente s2 = new Cliente();		
		s2.cpf = "0987654321";
		s2.email = "cliente@segundo.com";
		s2.nome = "Segundo cliente";
		System.out.println("Cliente - " + s2);
		
		Cliente s3 = new Cliente();		
		s3.cpf = "9999999990";
		s3.email = "cliente@terceiro.com";
		s3.nome = "Terceiro cliente";
		System.out.println("Cliente - " + s3);
	}
}