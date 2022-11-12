package br.edu.infnet.appproduto.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appproduto.model.domain.Escritorio;


@Controller
public class EscritorioController {
	
	private static Map<Integer, Escritorio> mapa = new HashMap<Integer, Escritorio>();	
	private static Integer id = 1;
	
	public static void incluir(Escritorio escritorio) {
		escritorio.setId(id++);
		mapa.put(escritorio.getId(), escritorio);
		
		System.out.println("> " + escritorio);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Escritorio> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/escritorio/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "escritorio/lista";
	}
	
	@GetMapping(value = "/escritorio/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/escritorio/lista";
	}

}
