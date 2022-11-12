package br.edu.infnet.appproduto.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appproduto.model.domain.Eletrodomestico;

@Controller
public class EletrodomesticoController {
	
	private static Map<Integer, Eletrodomestico> mapa = new HashMap<Integer, Eletrodomestico>();	
	private static Integer id = 1;
	
	public static void incluir(Eletrodomestico eletrodomestico) {
		eletrodomestico.setId(id++);
		mapa.put(eletrodomestico.getId(), eletrodomestico);
		
		System.out.println("> " + eletrodomestico);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Eletrodomestico> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/eletrodomestico/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "eletrodomestico/lista";
	}
	
	@GetMapping(value = "/eletrodomestico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/eletrodomestico/lista";
	}

}
