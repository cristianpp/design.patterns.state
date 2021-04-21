package com.br.designpatterns.state.test;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

import com.br.designpatterns.state.orcamento.Orcamento;
import com.br.designpatterns.state.orcamento.situacao.Finalizado;

public class AprovadoTest {
	

	@Test
	public void testCalcularValorDescontoExtraSituacaoAprovado() {
	    Orcamento orcamento = new Orcamento(new BigDecimal("500"), 3);
	    orcamento.aprovar();
	    orcamento.aplicarDescontoExtra();
	    assertTrue(new BigDecimal("490").compareTo(orcamento.getValor()) == 0);
	    
	}

	@Test
	public void testDeveConseguirAlterarSituacaoParaFinalizadoQuandoAprovador() {
		 Orcamento orcamento = new Orcamento(new BigDecimal("500"), 3);
		 orcamento.aprovar();
		 orcamento.aplicarDescontoExtra();
		 orcamento.finalizar();
		 assertTrue(orcamento.getSituacao() instanceof Finalizado);
	}

}
