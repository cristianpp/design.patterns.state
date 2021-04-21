package com.br.designpatterns.state.test;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

import com.br.designpatterns.state.desconto.CalculadoraDeDescontos;
import com.br.designpatterns.state.orcamento.Orcamento;

public class CalculadoraDeDescontosTest {
	
	private CalculadoraDeDescontos calculadoraDeDescontos;
	
	
	@Before
	public void inicio(){
		calculadoraDeDescontos = new CalculadoraDeDescontos();
	}

	@Test
	public void testCalcularOrcamentoComDescontoMaisDeCincoItens() {

		Orcamento orcamento = new Orcamento(new BigDecimal("500"), 10);
		BigDecimal orcamentoCalculado = calculadoraDeDescontos.calcular(orcamento);
		assertTrue(new BigDecimal("50").compareTo(orcamentoCalculado) == 0);

	}

	@Test
	public void testCalcularOrcamentoComDescontoValorMaiorQueQuinhentos(){
		
		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 3);
		BigDecimal orcamentoComDesconto = calculadoraDeDescontos.calcular(orcamento);
		assertTrue(new BigDecimal("30").compareTo(orcamentoComDesconto) == 0);
	}
	
	@Test
	public void testOrcamentoSemDesconto() {

		Orcamento orcamento = new Orcamento(new BigDecimal("500"), 4);
		BigDecimal orcamentoSemDesconto = calculadoraDeDescontos.calcular(orcamento);
		assertTrue(BigDecimal.ZERO.compareTo(orcamentoSemDesconto) == 0);
	}

}
