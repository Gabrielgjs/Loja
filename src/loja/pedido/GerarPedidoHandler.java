package loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import loja.orcamento.Orcamento;
import loja.orcamento.situacao.ItemOrcamento;
import loja.pedido.acao.AcaoAposGerarPedido;

public class GerarPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void executar(GerarPedido geraPedido) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
