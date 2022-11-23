package loja.application;

import java.math.BigDecimal;

import loja.http.JavaHttpCliente;
import loja.orcamento.Orcamento;
import loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpCliente());
		
		registro.registrar(orcamento);
	}

}
