package br.edu.infnet.appproduto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appproduto.model.domain.Produto;

@Controller
public class ProdutoController {
	
	@GetMapping(value = "/produto/lista")
	public String telaLista(Model model) {
		
		Produto p1 = new Produto();		
		p1.setCodigo(12); 
		p1.setNome("Tv Samsung");
		p1.setValor(2000);
		
		Produto p2 = new Produto();	
		p2.setCodigo(144); 
		p2.setNome("Geladeira");
		p2.setValor(1500);	
		
		Produto p3 = new Produto();		
		p3.setCodigo(345); 
		p3.setNome("Notebook dell");
		p3.setValor(5000);

		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);

		model.addAttribute("listagem", produtos);

		return "produto/lista";
	}

}
