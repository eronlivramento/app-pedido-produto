package br.edu.infnet.appproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Cliente;
import br.edu.infnet.appproduto.model.domain.Usuario;
import br.edu.infnet.appproduto.model.domain.service.ClienteService;

@Order(3)
@Component
public class ClienteTeste implements ApplicationRunner {
	
	@Autowired
	private ClienteService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Cliente s1 = new Cliente();		
		s1.setCpf("12345667890");
		s1.setEmail("cliente@primeiro.com");
		s1.setNome("Primeiro cliente");
		s1.setUsuario(usuario);
		service.incluir(s1);
		
		Cliente s2 = new Cliente();		
		s2.setCpf("0987654321");
		s2.setEmail("cliente@segundo.com");
		s2.setNome("Segundo cliente");
		s2.setUsuario(usuario);
		System.out.println("Cliente - " + s2);
		service.incluir(s2);
		
		Cliente s3 = new Cliente();	
		s3.setCpf("9999999990");
		s3.setEmail("cliente@terceiro.com");
		s3.setNome("Terceiro cliente");	
		s3.setUsuario(usuario);
		System.out.println("Cliente - " + s3);
		service.incluir(s3);
	}
}