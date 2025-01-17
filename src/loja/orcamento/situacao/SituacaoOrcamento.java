package loja.orcamento.situacao;

import java.math.BigDecimal;

import loja.desconto.DomainException;
import loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	
	public BigDecimal calcularValorDescnotoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;	
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento n�o pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento n�o pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orcamento n�o pode ser finalizado!");
	}
}
