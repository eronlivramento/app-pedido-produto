package br.edu.infnet.appproduto.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appproduto.model.domain.Pedido;

@Controller
public class PedidoController {
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model) {
		
		Pedido p1 = new Pedido();		
		p1.setData(LocalDateTime.now());
		p1.setDescricao("Primeiro pedido");
		p1.setWeb(true);
		
		Pedido p2 = new Pedido();		
		p2.setData(LocalDateTime.now());
		p2.setDescricao("Segundo pedido");
		p2.setWeb(false);
		
		Pedido p3 = new Pedido();		
		p3.setData(LocalDateTime.now());
		p3.setDescricao("Terceiro pedido");
		p3.setWeb(false);

		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(p1);
		pedidos.add(p2);
		pedidos.add(p3);

		model.addAttribute("listagem", pedidos);

		return "pedido/lista";
	}
}
