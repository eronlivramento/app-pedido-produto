package br.edu.infnet.appproduto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appproduto.model.domain.EletroEletronico;

@Controller
public class EletroEletronicoController {
	
	@GetMapping(value = "/eletroeletronico/lista")
	public String telaLista(Model model) {
		
		EletroEletronico c1 = new EletroEletronico();		
		c1.setDescricao("DVD carro Philco");
		c1.setFragil(false);
		c1.setGarantiaEstendida(false);
		
		EletroEletronico c2 = new EletroEletronico();
		c2.setDescricao("Computador de mesa");
		c2.setFragil(true);
		c2.setGarantiaEstendida(true);
		
		EletroEletronico c3 = new EletroEletronico();
		c3.setDescricao("Notebook dell");
		c3.setFragil(true);
		c3.setGarantiaEstendida(true);

		List<EletroEletronico> eletroeletronicos = new ArrayList<EletroEletronico>();
		eletroeletronicos.add(c1);
		eletroeletronicos.add(c2);
		eletroeletronicos.add(c3);

		model.addAttribute("listagem", eletroeletronicos);

		return "eletroeletronico/lista";
	}

}
