package br.com.alura.loja;
import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.*;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
	public static void main(String[] args) {
		String cliente = "Alvaro";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);do linu
				Arrays.asList(new SalvarPedidoNoBancoDeDados(),
						new EnviarEmailPedido())); 
		handler.executa(gerador);
	
	}

}
