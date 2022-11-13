package br.edu.infnet.appproduto.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tescritorio")
public class Escritorio extends Produto {
	private boolean fragil;
	private float tamanho;
	private String descricao;
	
	@Override
	public String toString() {
		return fragil + ";" + tamanho + ";" + descricao;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}