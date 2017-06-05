package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

	public static void main(String[] args) {
		EstoqueWS estoque = new EstoqueWS();
		String url = "Http://localhost:8080/estoquews";

		Endpoint.publish(url, estoque);
		System.out.println("rodando");
	}

}
