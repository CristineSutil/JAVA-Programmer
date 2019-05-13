package br.com.impacta.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.impacta.classes.Filme;

public class ImdbUtil {
	
	/**
	 * Realiza a importacao de uma base de filmes em CSV retornando
	 * uma lista de instâncias de filme
	 * 
	 * @param filename Nome do arquivo csv
	 * 
	 * @return A lista de filmes importados a partir do arquivo informado
	 * @throws IOException 
	 */
	public static List<Filme> importFrom(String filename) throws IOException{
		List<Filme> filmes = new ArrayList<>();
		
		Scanner scan = new Scanner(new FileInputStream(filename));
		scan.nextLine();
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			Filme filme = converter(linha);
			filmes.add(filme);
		}
		return filmes;
	}

	private static Filme converter(String linha) {
		Filme filme = null;
		
		String[] atributos = linha.split("\\s*;\\s*");
		
		String titulo = atributos[0];
		String diretores = atributos[1];
		double nota = getDouble(atributos[2]);
		int duracao = getInt(atributos[3]);
		int ano = getInt(atributos[4]);
		String generos = atributos[5];
		int votos = getInt(atributos[6]);
		String dataRegistro = atributos[7];
		String url = atributos[8];
		
		filme = new Filme(titulo,diretores,nota,duracao,ano,generos,
													votos,dataRegistro,url);
		return filme;
	}

	private static int getInt(String valor) {
		try {
			return Integer.parseInt(valor);
		}catch(Exception e) {
			return 0;
		}
	}

	private static double getDouble(String valor) {
		try {
			return Double.parseDouble(valor);
		}catch(Exception e) {
			return 0;
		}
	}
}
