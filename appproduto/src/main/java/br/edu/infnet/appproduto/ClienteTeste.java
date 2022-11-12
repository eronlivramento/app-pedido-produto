package br.edu.infnet.appproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.controller.ClienteController;
import br.edu.infnet.appproduto.model.domain.Cliente;

@Order(6)
@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Cliente s1 = new Cliente();		
		s1.setCpf("12345667890");
		s1.setEmail("cliente@primeiro.com");
		s1.setNome("Primeiro cliente");
		ClienteController.incluir(s1);
		
		Cliente s2 = new Cliente();		
		s2.setCpf("0987654321");
		s2.setEmail("cliente@segundo.com");
		s2.setNome("Segundo cliente");
		System.out.println("Cliente - " + s2);
		ClienteController.incluir(s2);
		
		Cliente s3 = new Cliente();	
		s3.setCpf("9999999990");
		s3.setEmail("cliente@terceiro.com");
		s3.setNome("Terceiro cliente");	
		System.out.println("Cliente - " + s3);
		ClienteController.incluir(s3);
	}
}