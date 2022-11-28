package loja.application;

import java.math.BigDecimal;

import loja.http.ApacheHttpAdapter;
import loja.orcamento.Orcamento;
import loja.orcamento.RegistroDeOrcamento;
import loja.orcamento.situacao.ItemOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroDeOrcamento registro = new RegistroDeOrcamento(new ApacheHttpAdapter());
		registro.registrar(orcamento);
	}

}
