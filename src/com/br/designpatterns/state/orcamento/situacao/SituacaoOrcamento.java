package com.br.designpatterns.state.orcamento.situacao;

import java.math.BigDecimal;

import com.br.designpatterns.state.DomainExpception;
import com.br.designpatterns.state.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento orcamento){
		throw new DomainExpception("Orcamento nao pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento){
		throw new DomainExpception("Orcamento nao pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento){
		throw new DomainExpception("Orcamento nao pode ser finalizar!");
	}
}
