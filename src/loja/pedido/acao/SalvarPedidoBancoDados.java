package loja.pedido.acao;

import loja.pedido.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido {

	public void executar(Pedido pedido) {
		
	}

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando pedido com dados do pedido! ");
	}
	
}
