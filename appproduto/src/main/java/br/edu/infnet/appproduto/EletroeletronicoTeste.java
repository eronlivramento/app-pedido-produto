package br.edu.infnet.appproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Eletroeletronico;
import br.edu.infnet.appproduto.model.domain.Usuario;
import br.edu.infnet.appproduto.model.domain.service.EletroeletronicoService;

@Order(6)
@Component
public class EletroeletronicoTeste implements ApplicationRunner {
	
	@Autowired
	private EletroeletronicoService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Eletroeletronico c1 = new Eletroeletronico();		
		c1.setDescricao("DVD carro Philco");
		c1.setFragil(false);
		c1.setGarantiaEstendida(false);
		c1.setUsuario(usuario);
		service.incluir(c1);
		
		Eletroeletronico c2 = new Eletroeletronico();
		c2.setDescricao("Computador de mesa");
		c2.setFragil(true);
		c2.setGarantiaEstendida(true);
		c2.setUsuario(usuario);
		service.incluir(c2);
		
		Eletroeletronico c3 = new Eletroeletronico();
		c3.setDescricao("Notebook dell");
		c3.setFragil(true);
		c3.setGarantiaEstendida(true);
		c3.setUsuario(usuario);
		service.incluir(c3);
	}
}