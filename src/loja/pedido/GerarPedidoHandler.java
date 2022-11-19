package loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import loja.orcamento.Orcamento;
import loja.pedido.acao.AcaoAposGerarPedido;

public class GerarPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void executar(GerarPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
