package br.edu.infnet.appproduto.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appproduto.model.domain.Eletroeletronico;

@Controller
public class EletroEletronicoController {
	
	private static Map<Integer, Eletroeletronico> mapa = new HashMap<Integer, Eletroeletronico>();	
	private static Integer id = 1;
	
	public static void incluir(Eletroeletronico eletroeletronico) {
		eletroeletronico.setId(id++);
		mapa.put(eletroeletronico.getId(), eletroeletronico);
		
		System.out.println("> " + eletroeletronico);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Eletroeletronico> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/eletroeletronico/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "eletroeletronico/lista";
	}
	
	@GetMapping(value = "/eletroeletronico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/eletroeletronico/lista";
	}

}
