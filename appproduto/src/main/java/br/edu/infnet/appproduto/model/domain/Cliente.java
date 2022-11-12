package br.edu.infnet.appproduto.model.domain;

public class Cliente {
	public String nome;
	public String cpf;
	public String email;
	
	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + email;
	}
}
