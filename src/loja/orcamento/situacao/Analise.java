package loja.orcamento.situacao;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class Analise extends SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	
	public void reporvar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
}
