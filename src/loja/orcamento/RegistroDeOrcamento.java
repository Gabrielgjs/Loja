package loja.orcamento;

import java.util.Map;

import loja.desconto.DomainException;
import loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http;
	
	public RegistroDeOrcamento(HttpAdapter http) {
		super();
		this.http = http;
	}
	
	
	public void registrar(Orcamento orcamento) {
		// chamada HTTP para a API externa
		// URL Connection
		// Http Client
		// lib Rest 
		
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento n�o finalizado!");
		}
		String url =  "http://api.externa/orcamento"; 
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens" , orcamento.getQuantidadeItens()
				);
		http.post(url, dados);
		
	}
	
}
