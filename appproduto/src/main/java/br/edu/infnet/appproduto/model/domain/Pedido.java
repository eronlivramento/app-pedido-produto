package br.edu.infnet.appproduto.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Cliente cliente;
	private List<Produto> produtos;
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + web + ";" + cliente + ";" + produtos.size();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
