package br.edu.infnet.appproduto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appproduto.model.domain.Cliente;
import br.edu.infnet.appproduto.model.domain.Eletroeletronico;
import br.edu.infnet.appproduto.model.domain.Eletrodomestico;
import br.edu.infnet.appproduto.model.domain.Escritorio;
import br.edu.infnet.appproduto.model.domain.Pedido;
import br.edu.infnet.appproduto.model.domain.Produto;
import br.edu.infnet.appproduto.model.domain.Usuario;
import br.edu.infnet.appproduto.model.domain.service.PedidoService;

@Order(2)
@Component
public class PedidoTeste implements ApplicationRunner {
	
	@Autowired
	private PedidoService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Pedidos ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		
		Escritorio escritorio = new Escritorio();		
		escritorio.setFragil(false);
		escritorio.setDescricao("Mesa de escritorio");
		escritorio.setTamanho(3.50f);
		
		Eletroeletronico eletroeletronico = new Eletroeletronico();		
		eletroeletronico.setDescricao("DVD carro Philco");
		eletroeletronico.setFragil(false);
		eletroeletronico.setGarantiaEstendida(false);
		
		Eletrodomestico eletrodomestico = new Eletrodomestico();		
		eletrodomestico.setGarantiaEstendida(true);
		eletrodomestico.setDescricao("Batedeira Philco 4000");
		eletrodomestico.setQuantidade(1);
		
		Eletrodomestico eletrodomestrico2 = new Eletrodomestico();		
		eletrodomestrico2.setGarantiaEstendida(true);
		eletrodomestrico2.setDescricao("Tv 4k Samsung");
		eletrodomestrico2.setQuantidade(3);	
		
		Cliente cliente = new Cliente();		
		cliente.setCpf("12345667890");
		cliente.setEmail("cliente@primeiro.com");
		cliente.setNome("Primeiro cliente");
		
		
		Pedido p1 = new Pedido();		
		p1.setData(LocalDateTime.now());
		p1.setDescricao("Primeiro pedido");
		p1.setWeb(true);
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(escritorio);
		p1.setProdutos(produtos);
		p1.setCliente(cliente);
		p1.setUsuario(usuario);
		service.incluir(p1);
		
		Pedido p2 = new Pedido();		
		p2.setData(LocalDateTime.now());
		p2.setDescricao("Segundo pedido");
		p2.setWeb(false);
		produtos.clear();
		produtos.add(eletrodomestico);
		produtos.add(eletroeletronico);
		p2.setProdutos(produtos);
		p2.setCliente(cliente);
		p2.setUsuario(usuario);
		service.incluir(p2);
		
		Pedido p3 = new Pedido();		
		p3.setData(LocalDateTime.now());
		p3.setDescricao("Terceiro pedido");
		p3.setWeb(false);
		produtos.clear();
		produtos.add(eletrodomestrico2);
		p3.setProdutos(produtos);
		p3.setCliente(cliente);
		p3.setUsuario(usuario);
		service.incluir(p3);
	}
}