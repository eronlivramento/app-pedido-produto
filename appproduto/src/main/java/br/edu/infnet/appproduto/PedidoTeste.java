package br.edu.infnet.appproduto;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Pedido;

@Component
public class PedidoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Pedido p1 = new Pedido();		
		p1.setData(LocalDateTime.now());
		p1.setDescricao("Primeiro pedido");
		p1.setWeb(true);
		System.out.println("Pedido - " + p1);
		
		Pedido p2 = new Pedido();		
		p2.setData(LocalDateTime.now());
		p2.setDescricao("Segundo pedido");
		p2.setWeb(false);
		System.out.println("Pedido - " + p2);
		
		Pedido p3 = new Pedido();		
		p3.setData(LocalDateTime.now());
		p3.setDescricao("Terceiro pedido");
		p3.setWeb(false);
		System.out.println("Pedido - " + p3);
	}
}