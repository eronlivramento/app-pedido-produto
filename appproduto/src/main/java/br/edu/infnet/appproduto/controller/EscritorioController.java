package br.edu.infnet.appproduto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appproduto.model.domain.Escritorio;


@Controller
public class EscritorioController {
	
	@GetMapping(value = "/escritorio/lista")
	public String telaLista(Model model) {
		
		Escritorio b1 = new Escritorio();		
		b1.setFragil(false);
		b1.setDescricao("Mesa de escritorio");
		b1.setTamanho(3.50f);
		
		Escritorio b2 = new Escritorio();	
		b2.setFragil(true);
		b2.setDescricao("Sofa cama");
		b2.setTamanho(1.5f);
		
		Escritorio b3 = new Escritorio();	
		b3.setFragil(false);
		b3.setDescricao("Cama box");
		b3.setTamanho(2);

		List<Escritorio> escritorio = new ArrayList<Escritorio>();
		escritorio.add(b1);
		escritorio.add(b2);
		escritorio.add(b3);

		model.addAttribute("listagem", escritorio);

		return "escritorio/lista";
	}

}
