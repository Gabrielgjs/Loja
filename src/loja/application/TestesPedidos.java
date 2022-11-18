package loja.application;

import java.math.BigDecimal;

import loja.pedido.GerarPedido;
import loja.pedido.GerarPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
		GerarPedidoHandler handler = new GerarPedidoHandler();
		handler.executar(gerador);
	}

}
