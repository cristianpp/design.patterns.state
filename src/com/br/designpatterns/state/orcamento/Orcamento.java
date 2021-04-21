package com.br.designpatterns.state.orcamento;

import java.math.BigDecimal;

import com.br.designpatterns.state.orcamento.situacao.EmAnalise;
import com.br.designpatterns.state.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;

	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}

	public void aplicarDescontoExtra(){
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar(){
		this.situacao.aprovar(this);
	}
	
	public void reprovar(){
		this.situacao.reprovar(this);
	}
	
	public void finalizar(){
		this.situacao.finalizar(this);
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

}
