package loja.application;

import java.math.BigDecimal;

import loja.imposto.CalculadoraImpostos;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.Orcamento;
import loja.orcamento.situacao.ItemOrcamento;

public class TestesImpostos2 {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
	}

}
