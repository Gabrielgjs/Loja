package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class SemDesconto extends Desconto  {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

	@Override
	protected BigDecimal efetuaCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
