package com.br.designpatterns.state.orcamento.situacao;

import com.br.designpatterns.state.orcamento.Orcamento;

public class Reprovador extends SituacaoOrcamento {
	
		public void finalizar(Orcamento orcamento){
		orcamento.setSituacao(new Finalizado());
	}

}
