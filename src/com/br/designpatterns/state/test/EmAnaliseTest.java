package com.br.designpatterns.state.test;


import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.br.designpatterns.state.DomainExpception;
import com.br.designpatterns.state.orcamento.Orcamento;

public class EmAnaliseTest {
	
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testCalcularValorDescontoExtraSituacaoEmAnalise() {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("300"), 3);
		orcamento.aplicarDescontoExtra();
		assertTrue(new BigDecimal("285").compareTo(orcamento.getValor()) == 0);
		
	}

	@Test(expected=RuntimeException.class)
	public void testDeveLancarExceptionAoTentarFinalizarQuandoSituacaoEmAnalise() {
		Orcamento orcamento = new Orcamento(new BigDecimal("300"), 3 );

		orcamento.finalizar();
		
	}

	@Test
	public void testDeveCriticarAoMudarSituacaoEmAnaliseParaFinalizada() {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("300"), 3);
		thrown.expect(DomainExpception.class);
		thrown.expectMessage("Orcamento nao pode ser finalizar!");
		orcamento.finalizar();
	}
}
