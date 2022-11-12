package br.edu.infnet.appproduto.model.domain;

public class Escritorio extends Produto {
	public boolean fragil;
	public float tamanho;
	public String descricao;
	
	@Override
	public String toString() {
		return fragil + ";" + tamanho + ";" + descricao;
	}
}