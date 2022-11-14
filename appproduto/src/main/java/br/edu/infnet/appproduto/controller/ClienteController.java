package br.edu.infnet.appproduto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appproduto.model.domain.Cliente;
import br.edu.infnet.appproduto.model.domain.Usuario;
import br.edu.infnet.appproduto.model.domain.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.obterLista());

		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente")
	public String telaCadastro() {
		return "cliente/cadastro";
	}

	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
		
		cliente.setUsuario(usuario);
		
		service.incluir(cliente);
		
		return "redirect:/cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		service.excluir(id);
		
		return "redirect:/cliente/lista";
	}
}
