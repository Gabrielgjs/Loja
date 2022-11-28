package loja.application;

import java.math.BigDecimal;

import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.imposto.Imposto;
import loja.orcamento.Orcamento;
import loja.orcamento.situacao.ItemOrcamento;

public class TesteImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Imposto imposto = new ICMS(new ISS(null));
		System.out.println(imposto.calcular(orcamento));
	}
}
