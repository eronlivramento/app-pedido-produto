package br.edu.infnet.appproduto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appproduto.model.domain.Eletrodomestico;

@Controller
public class EletrodomesticoController {
	
	@GetMapping(value = "/eletrodomestico/lista")
	public String telaLista(Model model) {
		Eletrodomestico s1 = new Eletrodomestico();		
		s1.setGarantiaEstendida(true);
		s1.setDescricao("Batedeira Philco 4000");
		s1.setQuantidade(1);
		
		Eletrodomestico s2 = new Eletrodomestico();		
		s2.setGarantiaEstendida(false);
		s2.setDescricao("Maquina de lavar brastemp");
		s2.setQuantidade(2);	
		
		Eletrodomestico s3 = new Eletrodomestico();		
		s3.setGarantiaEstendida(true);
		s3.setDescricao("Tv 4k Samsung");
		s3.setQuantidade(3);	

		List<Eletrodomestico> eletrodomesticos = new ArrayList<Eletrodomestico>();
		eletrodomesticos.add(s1);
		eletrodomesticos.add(s2);
		eletrodomesticos.add(s3);

		model.addAttribute("listagem", eletrodomesticos);

		return "eletrodomestico/lista";
	}

}
