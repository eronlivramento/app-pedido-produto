package br.edu.infnet.appproduto.model.domain;

public class Eletrodomestico extends Produto {
	
	private float quantidade;
	private boolean garantiaEstendida;
	private String descricao;
	
	@Override
	public String toString() {
		return quantidade + ";" + garantiaEstendida + ";" + descricao;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isGarantiaEstendida() {
		return garantiaEstendida;
	}

	public void setGarantiaEstendida(boolean garantiaEstendida) {
		this.garantiaEstendida = garantiaEstendida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
