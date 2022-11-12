package br.edu.infnet.appproduto.model.domain;

public class EletroEletronico extends Produto {
	public boolean fragil;
	public boolean garantiaEstendida;
	public String descricao;
	
	@Override
	public String toString() {
		return fragil + ";" + garantiaEstendida + ";" + descricao;
	}

}
