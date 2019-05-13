package br.com.impacta.aplicacoes;

import java.io.IOException;
import java.util.List;

import br.com.impacta.classes.Filme;
import br.com.impacta.util.ImdbUtil;

public class AppImdb {
	
	public static void main(String[] args) {
		
		try {
			
			List<Filme> filmes = ImdbUtil.importFrom("filmes-imdb-ago-2016.csv");
			filmes.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
