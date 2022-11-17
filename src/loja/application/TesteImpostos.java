package loja.application;

import java.math.BigDecimal;

import loja.imposto.CalculadoraImpostos;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("500"), 1);
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
		System.out.println(calculadora.calcular(orcamento2, new ISS()));
	}

}
