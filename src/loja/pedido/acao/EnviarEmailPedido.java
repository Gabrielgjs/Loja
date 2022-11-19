package loja.pedido.acao;

import loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	
	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com os dados do pedido.");
	}
	
}
