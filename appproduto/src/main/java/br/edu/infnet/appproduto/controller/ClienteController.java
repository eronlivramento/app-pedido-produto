package br.edu.infnet.appproduto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appproduto.model.domain.Cliente;

@Controller
public class ClienteController {

	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
		
		Cliente s1 = new Cliente();		
		s1.setCpf("12345667890");
		s1.setEmail("cliente@primeiro.com");
		s1.setNome("Primeiro cliente");
		
		Cliente s2 = new Cliente();		
		s2.setCpf("0987654321");
		s2.setEmail("cliente@segundo.com");
		s2.setNome("Segundo cliente");
		
		Cliente s3 = new Cliente();	
		s3.setCpf("9999999990");
		s3.setEmail("cliente@terceiro.com");
		s3.setNome("Terceiro cliente");	

		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(s1);
		clientes.add(s2);
		clientes.add(s3);

		model.addAttribute("listagem", clientes);

		return "cliente/lista";
	}
}
