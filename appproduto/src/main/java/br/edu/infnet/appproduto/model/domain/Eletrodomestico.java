package br.edu.infnet.appproduto.model.domain;

public class Eletrodomestico extends Produto {
	
	public float quantidade;
	public boolean garantiaEstendida;
	public String descricao;
	
	@Override
	public String toString() {
		return quantidade + ";" + garantiaEstendida + ";" + descricao;
	}
}
