package br.edu.infnet.appproduto.model.domain;

public class Eletroeletronico extends Produto {
	private boolean fragil;
	private boolean garantiaEstendida;
	private String descricao;
	
	@Override
	public String toString() {
		return fragil + ";" + garantiaEstendida + ";" + descricao;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
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
