package loja.application;

import java.math.BigDecimal;
import java.util.Arrays;

import loja.pedido.GerarPedido;
import loja.pedido.GerarPedidoHandler;
import loja.pedido.LogDePedido;
import loja.pedido.acao.EnviarEmailPedido;
import loja.pedido.acao.SalvarPedidoBancoDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
		GerarPedidoHandler handler = new GerarPedidoHandler(
				Arrays.asList(new SalvarPedidoBancoDados(),
				new EnviarEmailPedido(),
				new LogDePedido()));
		handler.executar(gerador);
	}

}
