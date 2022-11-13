package br.edu.infnet.appproduto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appproduto.model.domain.service.EletroeletronicoService;

@Controller
public class EletroeletronicoController {
	
	@Autowired
	private EletroeletronicoService service;
	
	@GetMapping(value = "/eletroeletronico/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.obterLista());

		return "eletroeletronico/lista";
	}
	
	@GetMapping(value = "/eletroeletronico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		service.excluir(id);
		
		return "redirect:/eletroeletronico/lista";
	}

}
