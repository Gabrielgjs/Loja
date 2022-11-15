package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDescontos {

	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto desconto = new DescontoOrcamentoMaisDeCincoItens(
				new DescontoOrcamentoMaiorQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
}
