package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public  BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) { // template method
			return efetuaCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	
	public abstract boolean deveAplicar(Orcamento orcamento);
	protected abstract BigDecimal efetuaCalculo(Orcamento orcamento);
}
