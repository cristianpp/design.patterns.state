package com.br.designpatterns.state.desconto;

import java.math.BigDecimal;

import com.br.designpatterns.state.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {

		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));

		return desconto.calcular(orcamento);
	}
}
