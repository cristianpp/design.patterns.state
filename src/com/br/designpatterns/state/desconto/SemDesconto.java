package com.br.designpatterns.state.desconto;

import java.math.BigDecimal;

import com.br.designpatterns.state.orcamento.Orcamento;

public class SemDesconto extends Desconto{
	
	public SemDesconto(){
		super(null);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
	

}
