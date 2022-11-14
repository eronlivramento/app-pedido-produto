package br.edu.infnet.appproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Usuario;
import br.edu.infnet.appproduto.model.domain.service.UsuarioService;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Usuários ##");
		
		Usuario u1 = new Usuario();
		u1.setEmail("Administrador@admin.com");
		u1.setNome("Administrador do sistema");
		u1.setSenha("admin");
		usuarioService.incluir(u1);
	}
}