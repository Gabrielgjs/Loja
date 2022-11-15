package loja.application;

import java.math.BigDecimal;

import loja.desconto.CalculadoraDescontos;
import loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		
		Orcamento primeiro = new Orcamento(new BigDecimal("1000"), 1);
		Orcamento segundo = new Orcamento(new BigDecimal("200"), 2);
		
		CalculadoraDescontos calculadora = new CalculadoraDescontos();
		
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
	}

}
