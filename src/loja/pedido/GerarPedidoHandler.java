package loja.pedido;

import java.time.LocalDateTime;

import loja.orcamento.Orcamento;

public class GerarPedidoHandler {

	//injeção de dependencias para servicos de infra
	
	public GerarPedidoHandler() {
	}
	
	public void executar(GerarPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		// utilizacao dos servicos de infra
	
	}
}
