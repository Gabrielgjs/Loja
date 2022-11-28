package loja.application;

import java.math.BigDecimal;

import loja.desconto.CalculadoraDescontos;
import loja.orcamento.Orcamento;
import loja.orcamento.situacao.ItemOrcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		
		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		
		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		
		CalculadoraDescontos calculadora = new CalculadoraDescontos();
		
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
	}

}
